package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(10);
        dlist.addFirst(20);
        dlist.addFirst(30);
        dlist.addLast(40);
        dlist.addLast(50);
        dlist.addLast(60);
        dlist.removeLast();
        dlist.removeFirst();

       // dlist.display();


    }
}
