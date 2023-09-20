public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(10);
        list.addLast(10);
//        System.out.println(list.occurance(40));
        list.convertingToCircularLL();
        System.out.println(list.isCircularLL());

    }
}