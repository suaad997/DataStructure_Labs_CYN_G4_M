package Tree;

public class BinaryTree {
  private Node root;

    public BinaryTree(int rootValue) {
        root=new Node(rootValue,null,null);
    }

    private void insert(Node newNode, Node root){
        if(newNode.getValue()> root.getValue()){
            if(root.getRight()==null) {
                root.setRight(newNode);
            }
            else {
                insert(newNode,root.getRight());
            }
        }
        else if(newNode.getValue()< root.getValue()){
            if(root.getLeft()==null) {
                root.setLeft(newNode);
            }
            else {
                insert(newNode,root.getLeft());
            }

        }
        else {
            System.out.println("Duplicated values not allowed");
        }

    }
    public void insertNode(int value){
        Node newNode=new Node(value,null,null);
        insert(newNode,root);
    }


    private boolean search(int value, Node node){
        if(node==null) return false;
        if(value> node.getValue())
            return search(value,node.getRight());
        else if (value< node.getValue())
            return search(value,node.getLeft());
        else return true;

    }
    public boolean searchNode(int svalue){
        return search(svalue,root);
    }

    private void preOrderT(Node node){
        if (node==null) return;
        System.out.print(node.getValue()+" ");
        preOrderT(node.getLeft());
        preOrderT(node.getRight());

    }
    public void preOrder(){
        preOrderT(root);
        System.out.println();
    }

    private void inOrderT(Node node){
        if (node==null) return;
        inOrderT(node.getLeft());
        System.out.print(node.getValue()+" ");
        inOrderT(node.getRight());

    }
    public void inOrder(){
        inOrderT(root);
        System.out.println();
    }
    private void postOrderT(Node node){
        if (node==null) return;
        postOrderT(node.getLeft());
        postOrderT(node.getRight());
        System.out.print(node.getValue()+" ");


    }
    public void postOrderT(){
        postOrderT(root);
        System.out.println();
    }

    public void printSideways() {
        printSideways(root, 0);
    }

    private void printSideways(Node node, int depth) {
        if (node == null) return;

        printSideways(node.getRight(), depth + 1);
        System.out.println(" ".repeat(depth * 4) + node.getValue());
        printSideways(node.getLeft(), depth + 1);
    }







    class Node{
     private int value;
     private Node left;
     private Node right;

     public Node(int value, Node left, Node right) {
         this.value = value;
         this.left = left;
         this.right = right;
     }

     public int getValue() {
         return value;
     }

     public void setValue(int value) {
         this.value = value;
     }

     public Node getLeft() {
         return left;
     }

     public void setLeft(Node left) {
         this.left = left;
     }

     public Node getRight() {
         return right;
     }

     public void setRight(Node right) {
         this.right = right;
     }
 }



}
