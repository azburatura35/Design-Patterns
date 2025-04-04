package abstractfactory.factory;

import abstractfactory.enums.FactoryTypes;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryTypes factoryTypes) {

        return switch (factoryTypes) {
            case TOY -> new AnimalFactory();
            case COLOR -> new ColorFactory();
        };
    }
}