package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list =new SinglyLinkedList<Integer>();
        list.addFirst(10);
        list.addLast(40);
        list.addFirst(20);
        list.removeLast();
        list.addFirst(30);
        list.addLast(50);
        list.removeFirst();
        list.display();

    }
}
