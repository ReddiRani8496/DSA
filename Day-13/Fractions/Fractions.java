public class Fractions {
    public static void add(int num1,int denm1, int num2, int denm2) {

        int lcm = lcmOfNumbers(denm1,denm2);
        String operation = "+";
        int updatednumerator = numeratorsCalculation(denm1,denm2, lcm, num1, num2,operation);
        String sum = resultantFraction(updatednumerator,lcm);
        System.out.println("Sum of two fractions =" + sum);

    }

    public static void sub(int num1,int denm1, int num2, int denm2) {

        int lcm = lcmOfNumbers(denm1,denm2);
        String operation = "-";
        int updatedNumerator = numeratorsCalculation(denm1,denm2, lcm, num1, num2,operation);

        String sub = resultantFraction(updatedNumerator,lcm);
        System.out.println("Subtraction of two fractions: "+sub);

    }

    public static void mul(int num1,int denm1, int num2, int denm2) {

        int lcm = lcmOfNumbers(denm1,denm2);
        String operation = "*";
        int updatedNumerator = numeratorsCalculation(denm1,denm2, lcm, num1, num2,operation);

        String mul = resultantFraction(updatedNumerator,lcm);
        System.out.println("Multiplication of two fractions: "+mul);

    }


    public static void div(int num1,int denm1, int num2, int denm2) {

        int lcm = lcmOfNumbers(denm1,denm2);
        String operation = "/";
        int updatedNumerator = numeratorsCalculation(denm1,denm2, lcm, num1, num2,operation);

        String div = resultantFraction(updatedNumerator,lcm);
        System.out.println("Division  of two fractions: " + div);

    }

    private static int lcmOfNumbers(int denm1,int denm2) {

        int lcm = Math.max(denm1, denm2);

        while (true) {
            if (lcm % denm1 == 0 && lcm % denm2 == 0) {
                return lcm;
            }
            ++lcm;
        }

    }
    private static int numeratorsCalculation(int denm1,int denm2,int lcm, int num1, int num2, String str) {

        denm1 = lcm/denm1;
        denm2 = lcm/denm2;
        num1 *= denm1;
        num2 *= denm2;
        if(str.equals("+"))
            return num1 + num2;
        else if(str.equals("-"))
            return num1 - num2;
        else if(str.equals("*"))
            return num1 * num2;
        else
            return num1 / num2;

    }
    private static String resultantFraction(int numerator, int denominator) {
        int quotient =0;
        int remainder = 0;
        if(numerator>denominator) {
            quotient = numerator / denominator;
            remainder = numerator % denominator;
            if (remainder == 0)
                remainder = 1;
        }
        else{
            quotient = numerator;
            remainder = denominator;
        }
        String sum = quotient+"/"+remainder;
        return sum;

    }


}
