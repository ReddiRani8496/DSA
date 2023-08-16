import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int denm1 = sc.nextInt();
        int num2 = sc.nextInt();
        int denm2 = sc.nextInt();
        Fractions.add(num1,denm1,num2,denm2);
        Fractions.sub(num1,denm1,num2,denm2);
        Fractions.mul(num1,denm1,num2,denm2);
        Fractions.div(num1, denm1, num2, denm2);

    }

}