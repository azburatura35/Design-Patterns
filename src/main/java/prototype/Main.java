package prototype;

public class Main {

    public static void main(String[] args) {

        Position position = new Position(15,25);
        PineTree pineTree = new PineTree(30, 10);
        pineTree.setPosition(position);
        PineTree otherPineTree = (PineTree) pineTree.copy();


        System.out.println(pineTree);
        System.out.println(otherPineTree);
    }

}
