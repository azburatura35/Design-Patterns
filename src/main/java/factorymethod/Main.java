package factorymethod;

import factorymethod.entity.Circle;
import factorymethod.entity.Rectangle;
import factorymethod.entity.Square;
import factorymethod.enums.ShapeType;
import factorymethod.factory.ShapeFactory;

public class Main {

    public static void main(String[] args) {

        Circle circle = (Circle) ShapeFactory.getShape(ShapeType.CIRCLE);
        Rectangle rectangle = (Rectangle) ShapeFactory.getShape(ShapeType.RECTANGLE);
        Square square = (Square) ShapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();
        rectangle.draw();
        square.draw();

    }

}
