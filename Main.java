//Write a Java program to push in 10 items into a stack data structure and delete the middle item from the stack.
import java.util.Stack;

class Main {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    StackMethods stackMethods = new StackMethods();
    stackMethods.populateStack(stack);
    stackMethods.removeMiddleItem(stack);
  }
}
