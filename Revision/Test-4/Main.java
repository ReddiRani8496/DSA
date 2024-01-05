import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of buyers
        int N = scanner.nextInt();

        // Read the budgets of buyers into an array
        int[] budgets = new int[N];
        for (int i = 0; i < N; i++) {
            budgets[i] = scanner.nextInt();
        }

        // Sort the budgets in descending order
        Arrays.sort(budgets);

        // Calculate the maximum profit
        int maxProfit = 0;
        for (int i = 0; i < N; i++) {
            int profit = budgets[i] * (N - i);
            maxProfit = Math.max(maxProfit, profit);
        }

        // Print the maximum profit
        System.out.println(maxProfit);

        // Close the scanner
        scanner.close();
    }
}
