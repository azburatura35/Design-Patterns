package abstractfactory.factory;

import abstractfactory.data.Color;
import abstractfactory.data.Brown;
import abstractfactory.data.Yellow;
import abstractfactory.enums.ColorTypes;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public <E extends Enum<E>> Color create(E enumObject) {
        return switch ((ColorTypes) enumObject) {
            case BROWN -> new Brown();
            case YELLOW -> new Yellow();
        };
    }
}
