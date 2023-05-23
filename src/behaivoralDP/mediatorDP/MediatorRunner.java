package behaivoralDP.mediatorDP;

public class MediatorRunner {
    public static void main(String[] args) {

    MediatorRunner runner = new MediatorRunner();
    runner.mediator();

    }

    void mediator(){

        MessageDispatcher dispatcher = new MessageDispatcher();
        //create teacher object

        Teacher chemistryTeacher = new MessageTeacher("ChemistryTeacher", dispatcher);
        Teacher mathTeacher = new MessageTeacher("MathTeacher", dispatcher);
        Teacher physicTeacher = new MessageTeacher("PhysicTeacher", dispatcher);
        Teacher biologyTeacher = new MessageTeacher("BiologyTeacher", dispatcher);

        //register teacher to the dispatcher
        dispatcher.register("chemistry", chemistryTeacher);
        dispatcher.register("math", mathTeacher);
        dispatcher.register("physics", physicTeacher);
        dispatcher.register("biology", biologyTeacher);


        //one teacher can ask any question from other
        chemistryTeacher.sendMessage("math","message about Math");
        chemistryTeacher.sendMessage("physics","message about Physics");
        chemistryTeacher.sendMessage("biology","message about Biology");

    }

}
