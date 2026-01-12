package Stack;

public class Main {
    public static void main(String[] args) {
        DlinkedListStack<Integer> slStack=new DlinkedListStack<Integer>();
        slStack.push(10);
        slStack.push(20);
        slStack.push(30);
        slStack.push(40);
//        slStack.pop();
//        slStack.pop();
//        slStack.peek();
        while (!slStack.isEmpty()){
            System.out.println(slStack.pop());
        }

    }
}
