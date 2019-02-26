package org.acadeamiadecodigo.mainiacs.Elements;

public class ElementsFactory {

    public static Elements getNewElement() {

        double elementRandom = (Math.random() * ElementsType.values().length);

        if (elementRandom <= 0.69){
            elementRandom = 0;
        } else if (elementRandom >= 0.7 && elementRandom <= 2.9) {
            elementRandom = 1;
        } else {
            elementRandom = 2;
        }

        ElementsType type = ElementsType.values()[(int)elementRandom];

        Elements element;

        switch (type) {

            case ICEBERG:
                element = new Iceberg();
                break;
            case SHIPWRECKED:
                element = new Shipwrecked();
                break;
            case SHARK:
                element = new Shark();
                break;
            default: element = new Shipwrecked();
        }
        return element;
    }

}
