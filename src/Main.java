import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create users
    	TeachingAssistant user1 = new TeachingAssistant("Alice");
//        User user2 = new User("Bob");

        // Create channels
        Channels bargainChannel = new Channels("Bargain");
//        Channels picketChannel = new Channels("Picket");

        // Subscribe users to channels
        user1.subscribeToChannel(bargainChannel);
        System.out.println();
//        user1.subscribeToChannel(picketChannel);
//        user2.subscribeToChannel(bargainChannel);

        // Create and add news objects to channels
        bargainChannel.notifyObservers(new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm .", 120, LocalDateTime.now()));
        System.out.println();
//        picketChannel.notifyObservers(new News("University News", "Picket", "Picket schedule for tomorrow.", 150, LocalDateTime.now()));

        // View and clear messages for users
        System.out.println();
        user1.viewMessages();
//        user2.viewMessages();
    }

}
