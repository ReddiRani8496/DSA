import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        DoubleLinkedList  list = new DoubleLinkedList();
        list.addNext(10);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(6);
        list.printUpNodes();
        System.out.println();
        list.printNextNodes();

    }

}
