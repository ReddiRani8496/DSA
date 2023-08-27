public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(20);
        list.addLast(50);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        list.addFirst(60);
//        list.printElements();
//        list.removeFirst();
//        list.printReverse();
//        System.out.println(list.size());
        list.removeAt(0);
        list.printElements();
        System.out.println(list.size());
    }
}