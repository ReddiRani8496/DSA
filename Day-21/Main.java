public class Main {
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addFirst(10);
       list.addLast(20);
      list.addLast(90);
      list.addLast(40);
      list.addLast(50);
//        System.out.println(list.indexOf(10));
//        System.out.println(list.valueOf(1));
//        System.out.println(list.contains(10));
//        list.printMiddle();
       list.getPreviousNode(10);
       list.getNextNextNode(20);

    }
}

