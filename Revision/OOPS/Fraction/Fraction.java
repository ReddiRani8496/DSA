package Fraction;

public class Fraction {
    private int numerator; // 0
    private  int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int min = Math.min(numerator,denominator);
        for (int i=min;i>=1;i--) {
            if(numerator%i==0 && denominator%i==0) {
                gcd=i;
                break;
            }
        }
        this.numerator /= gcd; // numerator = numerator/gcd
        this.denominator /= gcd;
    }

    public void increment() {
        numerator += denominator; // numerator = numerator+denominator
        simplify();
    }

    public void add(Fraction fraction) { // 3/5 1/2
        this.numerator = (this.numerator*fraction.denominator) + (fraction.numerator * this.denominator);
        this.denominator = this.denominator*fraction.denominator;
        simplify();
    }

    public void add1(Fraction fraction1, Fraction fraction2) {
        numerator = (fraction1.numerator*fraction2.denominator) + (fraction2.numerator * fraction1.denominator);
        denominator = fraction1.denominator*fraction2.denominator;
        simplify();
    }

    public void print() {
        System.out.println(numerator+"/"+denominator);

    }
}
