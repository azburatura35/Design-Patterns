package abstractfactory;

import abstractfactory.data.Animal;
import abstractfactory.data.Brown;
import abstractfactory.data.Color;
import abstractfactory.data.Dog;
import abstractfactory.enums.AnimalTypes;
import abstractfactory.enums.ColorTypes;
import abstractfactory.enums.FactoryTypes;
import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.FactoryProvider;

public class Main {

    public static void main(String[] args) {

        //creating a brown toy dog
        AbstractFactory toyFactory = FactoryProvider.getFactory(FactoryTypes.TOY);
        Animal toy = (Dog) toyFactory.create(AnimalTypes.DOG);

        AbstractFactory colorFactory = FactoryProvider.getFactory(FactoryTypes.COLOR);
        Color color = (Brown) colorFactory.create(ColorTypes.BROWN);

        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();

        System.out.println(result);
    }

}
