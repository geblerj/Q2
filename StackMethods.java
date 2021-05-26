import java.util.Stack;

public class StackMethods{
	public void populateStack(Stack<Integer> stack){
		for(int i=0;i<10;i++){
			stack.push(i);
		}
	}
	public void removeMiddleItem(Stack<Integer> stack){
		stack.remove(5);
	}
}
