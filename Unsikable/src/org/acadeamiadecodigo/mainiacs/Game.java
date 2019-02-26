package org.acadeamiadecodigo.mainiacs;

import org.acadeamiadecodigo.mainiacs.Elements.*;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Game {

    public static int PADDING = 10;
    private static int PIXELCELL = 10;
    private static int height = 600;
    private static int width = 600;

    private Picture background;
    private static Elements[] elements;
    private static Text text;
    private static int score = 0;

    private static Ship ship;

    private boolean gameOver;

    private Picture over = new Picture(0 + PADDING,0 + PADDING, "resources/Game_Over.png");

    public static int getPIXELCELL() {
        return PIXELCELL;
    }

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    public int getPADDING() {
        return PADDING;
    }

    public void showScore() {
        text = new Text(347, 35,"Score : " + score);
        Rectangle rectangle = new Rectangle(324,20,65,40);
        rectangle.fill();
        rectangle.setColor(Color.WHITE);
        text.draw();
        text.grow(20,15);
        text.setColor(Color.BLUE);
    }


    public void scoreMore(){
        score++;
        showScore();
    }

    public void scoreLess(){
        score--;
        showScore();

    }

    public void init() throws InterruptedException {


        background = new Picture(0 + PADDING, 0 + PADDING, "resources/sea.png");
        background.draw();

        Music music = new Music();
        music.startMusic();

        ship = new Ship();
        ship.init();

        showScore();

        elements = new Elements[2000];


            for (int i = 0; i < elements.length; i++) {

                while (!gameOver)  {

                elements[i] = ElementsFactory.getNewElement();
                elements[i].move();

            }

            over.draw();
        }
    }

    public void checkCollision() {

        for (Elements e : elements) {

            if (e == null) {
                continue;
            }

            int posEY = e.getPicture().getY();
            int posSY = ship.getPicture().getY();
            int posEX = e.getPicture().getX();
            int posSX = ship.getPicture().getX();

            if(posEX+36 > posSX && posEX < posSX+36 && posEY+36 > posSY && posEY < posSY+36) {

                if (e instanceof Shipwrecked) {
                    scoreMore();
                    e.getPicture().delete();

                } else if (e instanceof Shark) {
                        scoreLess();
                        e.getPicture().delete();

                    } else {
                    e.getPicture().delete();
                    ship.getPicture().delete();
                    gameOver = true;

                }
            }
        }
    }
}
