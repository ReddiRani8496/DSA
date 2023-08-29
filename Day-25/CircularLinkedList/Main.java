public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addFirst(10);
        list.addLast(20);
//
//        list.print();
//        list.addFirst(20);
//        list.addLast(30);
//        list.addLast(40);
        list.print();
        System.out.println(list.size());
        list.removeFirst();
        list.print();
        System.out.println(list.size());
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.print();
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
        list.print();
        list.removeLast();
        System.out.println(list.size());
        list.print();
        list.removeLast();
        list.print();
        list.removeFirst();
        list.print();

    }
}