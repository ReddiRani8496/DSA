class Main {
   public static void main(String[] args) {
      RemoveDuplicatesLL ll = new RemoveDuplicatesLL();
      ll.addLast(10);
      ll.addLast(20);
      ll.addLast(30);
      ll.addLast(10);
      ll.addLast(50);
      ll.addLast(30);
      ll.removeDuplicates1();
   }
}
