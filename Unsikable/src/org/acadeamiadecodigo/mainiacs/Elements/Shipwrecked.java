package org.acadeamiadecodigo.mainiacs.Elements;

import org.acadeamiadecodigo.mainiacs.Game;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Shipwrecked extends Elements {

    public Shipwrecked() {
        super(ElementsType.SHIPWRECKED, ( int )( 72 + Math.random() * (Game.getWidth() -246)),20,20,20, ElementsType.SHIPWRECKED.getLink());
    }

    @Override
    public void move() throws InterruptedException {
        super.move();


    }
}
