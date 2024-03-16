import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.time.LocalDateTime;

public class Testcases {

	@Test
	public void testPartTimeLibrarianReceivesSocialNews() {
	    PartTimeLibrarian user2 = new PartTimeLibrarian("Momina");
	    Social socialChannel = new Social();
	    user2.subscribeToChannel(socialChannel);
	    News news2 = new News("University News", "Social Event", "Join us for the campus picnic this Saturday.", 120, LocalDateTime.now());
	    socialChannel.notifyObservers(news2);
	    assertEquals("Messages for user Momina : Message: Join us for the campus picnic this Saturday. ", user2.viewMessages());
	}
    @Test
    public void testNewsOperations2() {
        TeachingAssistant user1 = new TeachingAssistant("Alice");
        Bargain bargainChannel = new Bargain();
        user1.subscribeToChannel(bargainChannel);
        News news1 = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm .", 120, LocalDateTime.now());
        bargainChannel.notifyObservers(news1);
   
        assertEquals("Messages for user Alice : Message: Hello Abdullah lets meet 5 pm . ", user1.viewMessages()); 

    }
    
    @Test
    public void testGraduateResearchAssistantReceivesPicketNews() {
        GraduateResearchAssistant user3 = new GraduateResearchAssistant("Mustehsan");
        Picket picketChannel = new Picket();
        user3.subscribeToChannel(picketChannel);
        News news3 = new News("University News", "Protest", "There will be a protest against tuition hikes tomorrow at noon.", 120, LocalDateTime.now());
        picketChannel.notifyObservers(news3);
        assertEquals("Messages for user Mustehsan : Message: There will be a protest against tuition hikes tomorrow at noon. ", user3.viewMessages());
    }
    
    @Test
    public void testContractFacultyReceivesStudentNews() {
        ContractFaculty user4 = new ContractFaculty("Fatima");
        Student studentChannel = new Student();
        user4.subscribeToChannel(studentChannel);
        News news4 = new News("University News", "Academic Updates", "Reminder: Midterm exams start next week. Prepare accordingly.", 120, LocalDateTime.now());
        studentChannel.notifyObservers(news4);
        assertEquals("Messages for user Fatima : Message: Reminder: Midterm exams start next week. Prepare accordingly. ", user4.viewMessages());
    }
    @Test
    public void testTeachingAssistantReceivesMultipleMessagesFromMultipleChannels() {
        TeachingAssistant user1 = new TeachingAssistant("Talha");
        
        Bargain bargainChannel = new Bargain();
        Social socialChannel = new Social();
        
        user1.subscribeToChannel(bargainChannel);
        user1.subscribeToChannel(socialChannel);
        
        News news1 = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        News news2 = new News("University News", "Social Event", "Join us for the campus picnic this Saturday. ", 120, LocalDateTime.now());
        
        bargainChannel.notifyObservers(news1);
        socialChannel.notifyObservers(news2);
        
        assertEquals("Messages for user Talha : Message: Join us for the campus picnic this Saturday.  Message: Hello Abdullah lets meet 5 pm. ", user1.viewMessages());
    }
    @Test
    public void testTeachingAssistantReceivesMultipleMessagesFromMultipleChannels2() {
        // Create user
        TeachingAssistant user1 = new TeachingAssistant("Talha");
        
        // Create channels
        Bargain bargainChannel = new Bargain();
        Social socialChannel = new Social();
        Picket picketChannel = new Picket();
        
        // Subscribe user to channels
        user1.subscribeToChannel(bargainChannel);
        user1.subscribeToChannel(socialChannel);
        user1.subscribeToChannel(picketChannel);
        
        // Create and notify with multiple news messages
        News news1 = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        News news2 = new News("University News", "Social Event", "Join us for the campus picnic this Saturday.", 120, LocalDateTime.now());
        News news3 = new News("University News", "Protest", "There will be a protest against tuition hikes tomorrow at noon.", 120, LocalDateTime.now());
        
        bargainChannel.notifyObservers(news1);
        socialChannel.notifyObservers(news2);
        picketChannel.notifyObservers(news3);
        
        // Test if the user received all messages from all channels
        assertEquals("Messages for user Talha : Message: There will be a protest against tuition hikes tomorrow at noon. Message: Join us for the campus picnic this Saturday. Message: Hello Abdullah lets meet 5 pm. ", user1.viewMessages());
    }

    @Test
    public void testTeachingAssistantUnsubscribeFromChannel() {
        // Create user
        TeachingAssistant user1 = new TeachingAssistant("Talha");
        
        Bargain bargainChannel = new Bargain();
        
        user1.subscribeToChannel(bargainChannel);
        
        News news1 = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        bargainChannel.notifyObservers(news1);
        
        assertEquals("Messages for user Talha : Message: Hello Abdullah lets meet 5 pm. ", user1.viewMessages());
        
        user1.unsubscribeFromChannel(bargainChannel);
       
        assertEquals("Messages for user Talha : ", user1.viewMessages());
    }
    @Test
    public void testLowercaseDecorator() {

        News news = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        
        LowercaseDecorator lowercaseDecorator = new LowercaseDecorator();
        String decoratedNews = lowercaseDecorator.performOperation(news);
        
        assertEquals("hello abdullah lets meet 5 pm.", decoratedNews);
    }
    
    @Test
    public void testUppercaseDecorator() {
        // Create news
        News news = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        
        UppercaseDecorator uppercaseDecorator = new UppercaseDecorator();
        
        String decoratedNews = uppercaseDecorator.performOperation(news);
        
        assertEquals("HELLO ABDULLAH LETS MEET 5 PM.", decoratedNews);
    }
    @Test
    public void testWordCountDecorator() {
        // Create news
        News news = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        
        WordCountDecorator wordCountDecorator = new WordCountDecorator();
        
        String wordCount = wordCountDecorator.performOperation(news);
        
        assertEquals("6", wordCount);
    }
    
    @Test
    public void testCharacterCountDecorator() {
        News news = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm.", 120, LocalDateTime.now());
        
        CharacterCountDecorator characterCountDecorator = new CharacterCountDecorator();
        
 
        String characterCount = characterCountDecorator.performOperation(news);
        
        assertEquals("30", characterCount);
    }


}

