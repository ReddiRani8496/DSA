package BitManipulation;

public class OffParticularBit {
    public static void main(String[] args) {
        int num = 20;
        int index = 4;
        int mask = ~(1<<index);
        System.out.println(num&mask);
    }
}
