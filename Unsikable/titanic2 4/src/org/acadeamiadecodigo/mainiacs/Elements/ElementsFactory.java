package org.acadeamiadecodigo.mainiacs.Elements;

public class ElementsFactory {

    /**
     * Manufactures new elements for the game
     *
     * @return a newly instantiated element
     */
    public static Elements getNewElement() {

        double elementRandom = (Math.random() * ElementsType.values().length);
        System.out.println(elementRandom);
        if (elementRandom <= 0.69){
            elementRandom = 0;
        } else if (elementRandom >= 0.7 && elementRandom <= 2.9) {
            elementRandom = 1;
        } else {
            elementRandom = 2;
        }

        ElementsType type = ElementsType.values()[(int)elementRandom];

        System.out.println(elementRandom);
        Elements element;

        System.out.println(type);
        //elements = (ElementsType.values()[(int) Math.random() * ElementsType.values().length]);

        switch (type) {

            case ICEBERG:
                element = new Iceberg();
                break;
            case SHIPWRECKED:
                element = new Shipwrecked();
                break;
            case DOOR:
                element = new Door();
                break;
            default: element = new Shipwrecked();
        }
        return element;
    }

}
