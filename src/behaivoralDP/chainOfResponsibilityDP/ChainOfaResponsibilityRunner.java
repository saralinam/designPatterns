package behaivoralDP.chainOfResponsibilityDP;

public class ChainOfaResponsibilityRunner {
    public static void main(String[] args) {

        ChainOfaResponsibilityRunner runner = new ChainOfaResponsibilityRunner();
        runner.chainOfResponsibility();

    }

    void chainOfResponsibility(){
        Approver generalManager = new GeneralManager();

       Approver manager = new Manager(generalManager);

       Approver official = new Official(manager);


        System.out.println("Limits for loan");

        System.out.println("For official, max limit is: <100 ");

        System.out.println("For official, max limit is: <500 ");

        System.out.println("For official, max limit is: no limit ");

        System.out.println("requested amount is : 50 ");

        System.out.println("request amount is : 450 ");
        official.approveLoan(1000);

        System.out.println("request amount is : 1050 ");
        official.approveLoan(1050);
    }

}
