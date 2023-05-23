package behaivoralDP.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    // create a variable to store news
    private String news;

    //this list will store news list

    private List<Channel> channelList= new ArrayList<>();

    // register chanel
    public  void addObserver(Channel channel){
        channelList.add(channel);

    }

    //method should be removed

    public  void removeObserver(Channel channel){
        channelList.remove(channel);
    }

    //sent/update news to the registered channels
    public void sendNews(String news){
        this.news=news;
        for (Channel channel : channelList){
            channel.update(this.news);
        }
    }


}
