import java.util.LinkedList;

public class OO {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        linkedList.addFirst("Grapes");

        linkedList.addLast("Strawberry");

        linkedList.remove("Banana");

        System.out.println("Linked List: " + linkedList);

        System.out.println("First Element: " + linkedList.getFirst());

        System.out.println("Last Element: " + linkedList.getLast());

        System.out.println("Is Empty" + linkedList.isEmpty());

        linkedList.clear();

        System.out.println("Is Empty after clear? " + linkedList.isEmpty());
    }
}
