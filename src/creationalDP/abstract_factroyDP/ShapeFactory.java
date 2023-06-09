package creationalDP.abstract_factroyDP;

public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        }
        return null;
    }
}