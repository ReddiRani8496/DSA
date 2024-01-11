import java.util.Scanner;

public class IncreasingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 8) {
            printIncreasingNumbers("", 0, n);
        }
    }

    private static void printIncreasingNumbers(String num, int prevDigit, int maxDigits) {
        if (num.length() == maxDigits) {
            System.out.print(num + " ");
            return;
        }

        for (int i = prevDigit + 1; i <= 9; i++) {
            printIncreasingNumbers(num + i, i, maxDigits);
        }
    }
}
