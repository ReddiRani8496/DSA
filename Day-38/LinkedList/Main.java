public class Main1 {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
//      list.createLoop();

//        list.traversal(list.createList());
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
//        list.addLast(5);

        list.traversal(list.lastNNodes(1));

    }
}

