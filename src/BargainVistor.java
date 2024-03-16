import java.util.Stack;

public class BargainVistor implements Visitor {

	@Override
	public String acceptVisitor(User user) {
		// TODO Auto-generated method stub
		Stack<News> copiedStack = new Stack<>();
		for (News item : user.messageStack) {
			if(item instanceof BargainNews) {
				copiedStack.push(item);
			}
		}
		      return copiedStack.toString();
	}
	
}

