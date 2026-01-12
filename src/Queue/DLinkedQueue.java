package Queue;

import DoublyLinkedList.DoublyLinkedList;
import SinglyLinkedList.SinglyLinkedList;

public class DLinkedQueue<E>  implements Queue<E> {
    DoublyLinkedList<E> slist=new DoublyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void enqueue(E data) {
        slist.addLast(data);
    }

    @Override
    public E dequeue() {
        return slist.removeFirst();
    }

    @Override
    public E front() {
        return slist.getFirst();
    }

    @Override
    public E rear() {
        return slist.getLast();
    }
}
