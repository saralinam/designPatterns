package behaivoralDP.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{
    // we need list of chanel

    private List<String> newsList= new ArrayList<>();


    @Override
    public void update(String news) {
        newsList.add(news); // all news is added to the list
    }

    @Override
    public void printNews() {

        //print all news of list
        for (String news:newsList){
            System.out.println(news);
        }
    }
}
