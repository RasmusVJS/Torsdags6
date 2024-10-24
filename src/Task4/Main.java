package Task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Circle circle = new Circle(2);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(square);
        shapeBuilder.addShape(circle);
        System.out.println(shapeBuilder.getTotalArea());
    }
}
