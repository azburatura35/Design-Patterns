package factorymethod.entity;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}
