import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
     
        Stack<String> stack = new Stack<>();

       
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: Element 3
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: Element 2


        System.out.println("Top element: " + stack.peek()); // Output: Top element: Element 1

 
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: Is the stack empty? false
    }
}
