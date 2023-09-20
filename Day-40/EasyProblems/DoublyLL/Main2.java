public class Main2 {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.reverse();
        dll.print();
        System.out.println(dll.size());
        dll.removeAt(1);
        dll.print();
    }
}
