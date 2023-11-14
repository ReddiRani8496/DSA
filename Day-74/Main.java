public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(6);
        tree.insert(5);
//        tree.insert(21);
//        tree.insert(29);
//        tree.insert(0);
//        tree.insert(7);
//        tree.insert(28);
//        tree.insert(51);
        tree.insert(46);
        tree.nodeWithoutSibling(tree.root);
      //  System.out.println(tree.max(tree.root));
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
