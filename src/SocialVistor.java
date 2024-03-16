import java.util.Stack;

public class SocialVistor {

	public String acceptVisitor(User user) {
		// TODO Auto-generated method stub
		Stack<News> copiedStack = new Stack<>();
		for (News item : user.messageStack) {
			if(item instanceof SocialNews) {
				copiedStack.push(item);
			}
		}
		      return copiedStack.toString();
	}
}
