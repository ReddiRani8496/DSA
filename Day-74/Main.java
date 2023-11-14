public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild = new Node(3);
       // tree.root.rightChild.leftChild = new Node(6);
        //tree.root.rightChild.rightChild = new Node(7);
        System.out.println(tree.isFullBinaryTree(tree.root));
    }
}