package creationalDP.singletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

//        SingleObject obj1 = new SingleObject();  //we can't use new keyword


        SingleObject obj2 = SingleObject.getInstance();
        System.out.println(obj2.message); //Hello

        obj2.changeMessage();   //Hello Batch 134-135

        //test if it is singleton object or not
        SingleObject obj3 = SingleObject.getInstance();
        System.out.println("Message for obj3 "+obj3.message);
    }
}
