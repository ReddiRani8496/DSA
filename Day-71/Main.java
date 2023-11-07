public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(16);
        tree.insert(25);
        tree.insert(6);
        tree.insert(17);
        tree.insert(21);
        tree.insert(29);
        tree.insert(0);
        tree.insert(7);
        tree.insert(28);
        tree.insert(51);
        tree.insert(46);
        System.out.println(tree.noOfLeafNodes(tree.root));
        System.out.println(tree.sizeOfTree(tree.root));
    }
}
