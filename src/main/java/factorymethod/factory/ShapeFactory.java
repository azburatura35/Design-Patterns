package factorymethod.factory;

import factorymethod.enums.ShapeType;
import factorymethod.entity.Circle;
import factorymethod.entity.Rectangle;
import factorymethod.entity.Shape;
import factorymethod.entity.Square;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
        };
    }

}
