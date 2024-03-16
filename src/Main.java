import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create users
    	User user1 = new User("Talha");
    	PartTimeLibrarian PartTimeLibrarian = new PartTimeLibrarian("momina");
    	GraduateResearchAssistant GraduateResearchAssitant = new GraduateResearchAssistant("Mustehsan");
    	ContractFaculty ContractFaculty = new ContractFaculty("Fatima");
    	

        Bargain bargainChannel = new Bargain();
        Social SocialChannel = new Social();
        Picket picketChannel = new Picket();
        Student student = new Student();

        LowercaseDecorator lowercaseDecorator = new LowercaseDecorator();
        UppercaseDecorator UppercaseDecorator = new UppercaseDecorator();
        WordCountDecorator WordCountDecorator = new WordCountDecorator();
        CharacterCountDecorator CharacterCountDecorator =  new CharacterCountDecorator();
  
        // Subscribe users to channels
        user1.subscribeToChannel(bargainChannel);
        System.out.println("\n");

        News news1 = new News("University News", "Negotiation", "Hello Abdullah lets meet 5 pm .", 120, LocalDateTime.now());
  
        News news2 = new News("University News", "Negotiation", "Strike ends tomorrow.", 120, LocalDateTime.now());
      bargainChannel.notifyObservers(news1);
      bargainChannel.notifyObservers(news2);
//        System.out.println(user1.getMessagestack());
        BargainVistor bargain = new BargainVistor();
       System.out.println(bargain.acceptVisitor(user1));
        
        
//        UppercaseDecorator.performOperation(news1);
//        

//  
    }

	private static void BargainNews() {
		// TODO Auto-generated method stub
		
	}
    

}
