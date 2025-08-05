import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Displaying the elements of the linked list
        System.out.println("Linked List: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst("First Element");

        // Adding an element at the end
        linkedList.addLast("Last Element");

        // Displaying the updated linked list
        System.out.println("Updated Linked List: " + linkedList);

        // Removing an element from the linked list
        linkedList.remove("Element 2");

        // Displaying the final linked list
        System.out.println("Final Linked List: " + linkedList);
    }
}
