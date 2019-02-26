package org.acadeamiadecodigo.mainiacs.Elements;

import org.acadeamiadecodigo.mainiacs.Game;
import org.academiadecodigo.simplegraphics.pictures.Picture;

    public class Elements {

        Game game = new Game();
        private ElementsType elementsType;
        private Picture element;
        private int mov;


    public Elements(ElementsType elementsType, int x, int y, int width, int height, String link){
        this.element = new Picture(x,y,link);
        element.draw();
        this.elementsType = elementsType;
    }

    public Picture getPicture() {
        return element;
    }

    public void move() throws InterruptedException {

        int x = 0;
        while(x < 16) {
            getPicture().translate(0, mov);
            mov += 5;
            Thread.sleep(200);
            x++;
            game.checkCollision();
        }
        Thread.sleep(0);
        getPicture().delete();
    }





}
