public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addLastOptimized(1);
        list.addLastOptimized(2);
        list.addLastOptimized(3);
        list.addLastOptimized(4);
//        list.addLastOptimized(2);
//        list.addLastOptimized(2);
//        list.addLastOptimized(3);
//        list.print();
//        list.removeDuplicates();
//        list.print();
//        System.out.println(list.size());
//        list.addLastOptimized(3);
//        list.print();
        list.removeDuplicates();
        list.print();
        System.out.println(list.size());

    }
}
