package org.acadeamiadecodigo.mainiacs.Elements;

import org.acadeamiadecodigo.mainiacs.Game;

public class Iceberg extends Elements  {

    public Iceberg() {
        super(ElementsType.ICEBERG, ( int )( 72 + (Math.random() * (Game.getWidth()-246))),20,20,20, ElementsType.ICEBERG.getLink());
    }

    @Override
    public void move() throws InterruptedException{
        super.move();

    }
}
