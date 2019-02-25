package org.acadeamiadecodigo.mainiacs.Elements;

import org.academiadecodigo.simplegraphics.graphics.Color;

public enum ElementsType {

    ICEBERG("resources/iceberg.png"),
    SHIPWRECKED("resources/shipwrecked.png"),
    SHARK("resources/shark.png"),
    SHIP( "resources/ship.png");

    private String link;

    ElementsType(String link){
        this.link = link;
    }


    public String getLink() {
        return link;
    }
}
