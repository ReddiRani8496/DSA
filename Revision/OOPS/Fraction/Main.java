package Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(4,8); // 1/2
//        fraction.increment();
//        fraction.print();
        Fraction fraction1 = new Fraction(3,5);
//        fraction.add(fraction1);
        fraction.add1(fraction,fraction1); // 1/1
        fraction.print();
    }
}
