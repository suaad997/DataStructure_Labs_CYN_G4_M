package Queue;

public class Main {
    public static void main(String[] args) {
        SLinkedQueue<String> lqueue=new SLinkedQueue<String>();
        lqueue.enqueue("Saleh");
        lqueue.enqueue("Ali");
        lqueue.enqueue("Mrwan");
        System.out.println("the front is="+lqueue.front());
        System.out.println("the last="+lqueue.rear());
        while (!lqueue.isEmpty()){
            System.out.println("element removed="+lqueue.dequeue());
        }



    }
}
