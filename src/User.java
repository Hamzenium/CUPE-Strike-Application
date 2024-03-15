import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class User {

	   private String username;
	    private Set<Channels> subscribedChannels;
	    private Stack<News> messageStack;

	    public User(String username) {
	        this.username = username;
	        this.subscribedChannels = new HashSet<>();
	        this.messageStack = new Stack<>();
	    }

	    public void subscribeToChannel(Channels channel) {
	        channel.registerObserver(this);
	        subscribedChannels.add(channel);
	        System.out.println("User " + username + " subscribed to channel " + channel.getChannelName());
	    }
	    public void unsubscribeFromChannel(Channels channel) {
	        channel.removeObserver(this);
	        subscribedChannels.remove(channel);
	        System.out.println("User " + username + " unsubscribed from channel " + channel.getChannelName());
	    }

	    public void update(News news) {
	        System.out.println("User " + username + " received message from channel " + news.getSource() + ": " + news.getMessage());
	        messageStack.push(news);
	    }
	    public void viewMessages() {
	        System.out.println("Messages for user " + username + ":");
	        while (!messageStack.isEmpty()) {
	            News news = messageStack.pop();
	            System.out.println( "Message: " + news.getMessage());
	        }
	        clearMessages();
	    }
	    private void clearMessages() {
	        messageStack.clear();
	    }

		public String getUsername() {
			return this.username;
		}

}
