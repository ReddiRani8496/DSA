package ComplexNumbers;

public class ComplexNumbers {
    private int real;
    private int imaginary;
    ComplexNumbers(int real,int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public  void add(ComplexNumbers c, ComplexNumbers c1) {
        this.real = c.real+c1.real;
        this.imaginary = c.imaginary + c1.imaginary;
    }

    public void multiply(ComplexNumbers c, ComplexNumbers c1) {
        int real = (c.real*c1.real) - (c.imaginary*c1.imaginary);
        int imaginary = (c.real*c1.imaginary) + (c1.real*c.imaginary);
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print() {
        System.out.println(real+" + i"+imaginary);
    }
}
