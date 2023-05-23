package behaivoralDP.ObserverDP;

public class ObserverRunner {
    public static void main(String[] args) {
        ObserverRunner observerRunner= new ObserverRunner();
        observerRunner.observerDemo();

    }

    void  observerDemo(){

        //create chanel

        Channel channel1= new NewsChannel();
        Channel channel2= new NewsChannel();
        Channel channel3= new NewsChannel();
        //create agency

        NewsAgency agency = new NewsAgency();

        // register channels to agency

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        // create post news

        agency.sendNews("Learn java at TechproEducation ");
        agency.sendNews("Batch 134-135 students are about to complete the bootcamp");
        System.out.println("News from Channel 1 : ");

        channel1.printNews();

        System.out.println("News from Channel 2 : ");
        channel2.printNews();
        System.out.println("News from Channel 3 : ");
        channel3.printNews();



    }
    }
