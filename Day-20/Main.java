public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        //System.out.println(list);

        System.out.println(list.valueOf(1));
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(10));
    }
}

