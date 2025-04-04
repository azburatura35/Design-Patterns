package abstractfactory.factory;

import abstractfactory.data.Animal;
import abstractfactory.data.Dog;
import abstractfactory.data.Duck;
import abstractfactory.enums.AnimalTypes;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public <E extends Enum<E>> Animal create(E enumObject) {
        return switch ((AnimalTypes) enumObject) {
            case DOG -> new Dog();
            case DUCK -> new Duck();
        };
    }

}