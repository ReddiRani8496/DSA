public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(2);
//        list.addLast(4);
        list.addLast(1);
        System.out.println(list.isPalindrome());
        list.printElements();
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        list.addFirst(60);
//        list.printElements();
//        list.removeFirst();
//        list.printReverse();
//        System.out.println(list.size());
//        list.reverse();
//        list.printElements();
    }
}