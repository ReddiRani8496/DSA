package BitManipulation;

public class ToggleBits {
    public static void main(String[] args) {
        int num = 20;
        int index = 3;
        int mask = 1<<index;
        System.out.println(num^mask);
    }
}
