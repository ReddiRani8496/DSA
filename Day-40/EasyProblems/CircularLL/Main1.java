public class Main1 {
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.addFirst(10);
        cll.addLast(20);
        cll.addLast(40);
        cll.addLast(30);
        cll.exchangeNodes();
        cll.traversal();
    }
}
