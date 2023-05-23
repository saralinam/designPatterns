package creationalDP.abstract_factroyDP;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

      AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
      Shape shape1=shapeFactory.getShape("Circle");
      shape1.draw();

      AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
      Color color1=colorFactory.getColor("Red");
      color1.fill();
      System.out.println("************************************************");
      Shape shape2=shapeFactory.getShape("Square");
      shape2.draw();

      Color color2=colorFactory.getColor("Green");
      color2.fill();

      System.out.println("************************************************");

      Shape shape3=shapeFactory.getShape("Rectangle");
      shape3.draw();

      Color color3 = colorFactory.getColor("Blue");
      color3.fill();

    }
}
