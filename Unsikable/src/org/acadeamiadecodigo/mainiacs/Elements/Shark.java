package org.acadeamiadecodigo.mainiacs.Elements;

import org.acadeamiadecodigo.mainiacs.Game;

public class Shark extends Elements{

    public Shark() {
        super(ElementsType.SHARK, ( int )( 72 + Math.random() * (Game.getWidth() -246)),20,20,20, ElementsType.SHARK.getLink());
    }

    @Override
    public void move() throws InterruptedException {
        super.move();

    }
}

