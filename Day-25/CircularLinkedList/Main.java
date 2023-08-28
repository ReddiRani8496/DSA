public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirst(10);

        list.print();
        list.addFirst(20);
        list.print();
    }
}