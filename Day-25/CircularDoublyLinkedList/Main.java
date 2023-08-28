public class Main {
    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.print();
        list.addFirst(30);
        list.print();
        
    }
}