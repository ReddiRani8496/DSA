package ComplexNumbers;

public class Main {
    public static void main(String[] args) {
        ComplexNumbers c = new ComplexNumbers(3,8);

        ComplexNumbers c1 = new ComplexNumbers(2,4);
        c.multiply(c,c1);
        c.print(); // 5+i12
    }
}
