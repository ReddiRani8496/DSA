import java.util.Scanner;

public class IsAlternateSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = n>>1;
        int res = (n ^mask)+1;
        if((res & (res-1)) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
