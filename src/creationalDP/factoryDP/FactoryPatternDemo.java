package creationalDP.factoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle1= new Circle();
        circle1.draw();

        Shape square1 = new Square();
        square1.draw();

        Shape rectangle1 = new Square();
        rectangle1.draw();
        System.out.println("********** Shape Factory ************");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1=shapeFactory.getShape("Rectangle");
        Shape shape2=shapeFactory.getShape("Circle");
        Shape shape3=shapeFactory.getShape("Square");

        shape1.draw();
        shape2.draw();
        shape3.draw();


    }
}
