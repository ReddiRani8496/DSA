public class Main {
    public static void main(String[] args) {
        CircularLL cl = new CircularLL();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.addLast(50);
        Node[] node = cl.splitList();
        cl.print(node[1]);
    }
}