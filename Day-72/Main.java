public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node tree2 = new Node(1);
        tree2.leftChild = new Node(2);
        tree2.rightChild = new Node(3);
        tree2.leftChild.leftChild = new Node(4);
        tree2.leftChild.rightChild = new Node(5);

        Node tree1 = new Node(1);
        tree1.leftChild = new Node(3);
        tree1.rightChild = new Node(2);
        tree1.rightChild.leftChild = new Node(15);
        tree1.rightChild.rightChild = new Node(4);

        System.out.println(tree.isMirror(tree1,tree2));

//        tree.insert(20);
//        tree.insert(16);
//        tree.insert(25);
//        tree.insert(6);
//        tree.insert(17);
//        tree.insert(21);
//        tree.insert(29);
//        tree.insert(0);
//        tree.insert(7);
//        tree.insert(28);
//        tree.insert(51);
//        tree.insert(46);
//        System.out.println(tree.max(tree.root));
//        System.out.println(tree.min(tree.root));
//        tree.nodesAtKDistance(tree.root, 1);
//        Tree tree1 = new Tree();
//        tree1.insert(20);
//        tree1.insert(16);
//        tree1.insert(25);
//        tree1.insert(6);
//        tree1.insert(17);
//        tree1.insert(21);
//        tree1.insert(29);
//        tree1.insert(0);
//        tree1.insert(7);
//        tree1.insert(28);
//        tree1.insert(51);
//        tree1.insert(46);
//        System.out.println(tree.isIdentical(tree.root, tree1.root));
    }
}
