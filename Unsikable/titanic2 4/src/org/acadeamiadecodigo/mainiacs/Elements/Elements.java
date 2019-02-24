package org.acadeamiadecodigo.mainiacs.Elements;

import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract public class Elements {

    private ElementsType elementsType;
    private Picture element;
    //private Rectangle rectangle;
    //protected CollisionDetector collisionDetector;

    public Elements(ElementsType elementsType, int x, int y, int width, int height, String link){
        this.element = new Picture(x,y,link);
        element.draw();
        this.elementsType = elementsType;
    }

    public Picture getPicture() {
        return element;
    }

    //public Rectangle getRectangle() {
     //   return rectangle;
    //}
    abstract public void move() throws InterruptedException;



}
