package creationalDP.abstract_factroyDP;

public class ColorFactory extends AbstractFactory{
    @Override  //overriding from abstract class
    Color getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
