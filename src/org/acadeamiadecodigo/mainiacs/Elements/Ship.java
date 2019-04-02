package org.acadeamiadecodigo.mainiacs.Elements;


import org.acadeamiadecodigo.mainiacs.Game;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Ship extends Elements implements KeyboardHandler {

    private Keyboard keyboard;
    private int SPEED = 1;
    private int moves = 0;
    private int score;

    public Ship() {
        super(ElementsType.SHIP,Game.getWidth() / 3 , 580, 20,20, ElementsType.SHIP.getLink());
        keyboard = new Keyboard(this);

        init();
    }

    @Override
    public void move(){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public void init(){

        keyboard = new Keyboard(this);

        KeyboardEvent upEvent = new KeyboardEvent();
        upEvent.setKey(KeyboardEvent.KEY_UP);
        upEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(upEvent);

        KeyboardEvent downEvent = new KeyboardEvent();
        downEvent.setKey(KeyboardEvent.KEY_DOWN);
        downEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(downEvent);


        KeyboardEvent leftEvent = new KeyboardEvent();
        leftEvent.setKey(KeyboardEvent.KEY_LEFT);
        leftEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(leftEvent);

        KeyboardEvent rightEvent = new KeyboardEvent();
        rightEvent.setKey(KeyboardEvent.KEY_RIGHT);
        rightEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(rightEvent);

        KeyboardEvent spaceBarEvent = new KeyboardEvent();
        spaceBarEvent.setKey(KeyboardEvent.KEY_SPACE);
        spaceBarEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spaceBarEvent);

        keyboard.addEventListener(leftEvent);
        keyboard.addEventListener(rightEvent);
        keyboard.addEventListener(upEvent);
        keyboard.addEventListener(downEvent);
        keyboard.addEventListener(spaceBarEvent);



    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_DOWN:
                if ( getPicture().getY() < Game.getHeight() - 20) {
                    getPicture().translate(0, 5);
                    break;
                }

            case KeyboardEvent.KEY_UP:
                if ( getPicture().getY() > 0 ) {
                    getPicture().translate(0, -5);
                    break;
                }

            case KeyboardEvent.KEY_LEFT:
                if ( getPicture().getX() > 72) {
                    getPicture().translate(-5, 0);
                    break;
                }

            case KeyboardEvent.KEY_RIGHT:
                if ( getPicture().getX() < Game.getWidth() - 174){
                    getPicture().translate(5, 0);
                    break;
                }


        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
