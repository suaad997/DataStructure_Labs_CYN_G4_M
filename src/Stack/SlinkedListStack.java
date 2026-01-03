package Stack;
public class SlinkedListStack<E> implements Stack<E> {
 //   SinglyLinkedList<E> slist=new SinglyLinkedList<E>();
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
    public void push(E data) {
        slist.addFirst(data);
    }

    @Override
    public E peek() {
        return slist.getFirst();
    }

    @Override
    public E pop() {
        return slist.removeFirst();
    }

  //  @Override
//    public void display() {
//        slist.display();
//    }

}
