import java.util.HashSet;
import java.util.Set;

public class Channels {
	private Set<User> subscribers;
    private String channelName;

    public Channels(String channelName) {
        this.channelName = channelName;
        this.subscribers = new HashSet<>();
    };

    public void registerObserver(User user) {
        this.subscribers.add(user);
        System.out.println("User " + user.getUsername() + " subscribed to channel " + channelName);
    };

    public void removeObserver(User user) {
        this.subscribers.remove(user);
        System.out.println("User " + user.getUsername() + " unsubscribed from channel " + channelName);
    }

    public void notifyObservers(News news) {
        for (User user : subscribers) {
            user.update(news);
        }
    }

    public void sendMessage(News news) {
        notifyObservers(news);
    }

    public String getChannelName() {
        return channelName;
    }

}