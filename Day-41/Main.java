public class Main {
    public static void main(String[] args) {
        var x = LinkedList.createLoop();
        System.out.println(x.detectLoop());
        x.removeLoop();
        System.out.println(x.detectLoop());
        System.out.println(x.lengthOfLoop());
    }
}