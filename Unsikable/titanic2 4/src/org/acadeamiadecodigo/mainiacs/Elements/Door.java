package org.acadeamiadecodigo.mainiacs.Elements;

import org.acadeamiadecodigo.mainiacs.Game;

public class Door extends Elements{

    private int speed = 100;
    private int mov;

    public Door() {
        super(ElementsType.DOOR, ( int )( 72 + Math.random() * (Game.getWidth() -246)),20,20,20, ElementsType.DOOR.getLink());
    }

    @Override
    public void move() throws InterruptedException {

        int x = 0;
        while(x < 16) {
            getPicture().translate(0, mov);
            mov += 5;
            Thread.sleep(200);
            x++;
            Game.checkCollision();
        }
        Thread.sleep(0);
        getPicture().delete();

    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }




}
