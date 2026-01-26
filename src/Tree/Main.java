package Tree;

public class Main {
    public static void main(String[] args) {

        BinaryTree bTree=new BinaryTree(10);
        bTree.insertNode(5);
        bTree.insertNode(7);
        bTree.insertNode(12);
        bTree.insertNode(4);
        bTree.insertNode(2);
        bTree.insertNode(11);
        bTree.insertNode(13);
        boolean result= bTree.searchNode(11);
        System.out.println("11 searching result is :"+result);
        System.out.println("preorder traversal");
        bTree.preOrder();
        System.out.println("preorder traversal");
        bTree.inOrder();
        System.out.println("preorder traversal");
        bTree.postOrderT();
        System.out.println("SideWays print");
        bTree.printSideways();













    }
}
