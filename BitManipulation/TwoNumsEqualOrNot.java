import java.util.Scanner;

public class TwoNumsEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if((n1^n2)==0)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
