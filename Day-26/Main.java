public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirstOptimized(10);
        list.print();
        list.addFirstOptimized(20);
        list.print();
        list.addLastOptimized(30);
        list.addLastOptimized(40);
        list.print();
    }
}
