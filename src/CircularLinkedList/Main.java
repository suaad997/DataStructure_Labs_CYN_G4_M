package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> clist=new CircularLinkedList<String>();
        clist.addFirst("Jaqoob");
        clist.addFirst("Salah");
        clist.addFirst("Qusi");
        clist.addLast("Mrwan");
        clist.addLast("Ahmed");
        clist.removeFirst();
        clist.removeLast();
        clist.display();
    }
}
