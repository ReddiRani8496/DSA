import java.util.Scanner;

public class TajMahal {
    public static void main(String[] args) {
        // Reading input from the user
        Scanner scanner = new Scanner(System.in);

        // Number of windows
        int n = scanner.nextInt();

        // Array to store the number of people at each window
        int[] people = new int[n];

        // Reading the number of people at each window
        for (int i = 0; i < n; i++) {
            people[i] = scanner.nextInt();
        }

        // Close the scanner as we have collected all the required input
        scanner.close();

        // Finding the window number where Aahad will get the ticket
        int windowNumber = findWindowNumber(n, people);

        // Printing the result
        System.out.println(windowNumber);
    }

    // Function to find the window number where Aahad will get the ticket
    private static int findWindowNumber(int n, int[] people) {
        int windowNumber = 0;

        // Loop to simulate Aahad's movement through windows
        for (int i = 0; i < n; i++) {
            // Calculate the remaining people in front of the current window
            int remainingPeople = people[i] - i;

            // If there are no people in front of the current window, Aahad will get the ticket here
            if (remainingPeople <= 0) {
                windowNumber = i + 1;
                break; // Exit the loop once Aahad gets the ticket
            }
        }

        return windowNumber;
    }
}
