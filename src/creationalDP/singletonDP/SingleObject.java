package creationalDP.singletonDP;

public class SingleObject {

    String message = "Hello";

    //it creates instance object
    private static SingleObject instance = new SingleObject();

    //this constructor cannot be access from other classes
    private SingleObject() {
    }

    //allows us to create object  only once
    public static SingleObject getInstance(){
        return instance;
    }

    public void changeMessage(){
        this.message = this.message + " Batch 134-135";
    }

}
