package structuralDP.decoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"MAX";//Iphone 11 pro+MAX
    }

    @Override
    public double getPrice() {
        return super.getPrice()+100;//799.5
    }
}
