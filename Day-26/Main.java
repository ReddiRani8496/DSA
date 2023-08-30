public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirstOptimized(10);
        list.addFirstOptimized(20);
        list.addLastOptimized(30);
        list.addLastOptimized(20);
        list.print();
       list.removeLastOccurance(20);
       list.print();
        System.out.println(list.size());
        list.removeLastOccurance(10);
        list.print();

    }
}