package Revision;

public class Main {
    public static void main(String[] args) {
        
        String input1 = "hellosannasmith";
        String challengeToken = "ycbpukhrd99";

        String result1 = searchingChallenge(input1);
        String finalOutput1 = combineWithChallengeToken(result1, challengeToken);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);
        System.out.println("Final Output: " + finalOutput1);

        System.out.println();

        String input2 = "abcdefgg";
        String finalOutput2 = combineWithChallengeToken(searchingChallenge(input2), challengeToken);
        System.out.println("Input: " + input2);
        System.out.println("Final Output: " + finalOutput2);
    }

    public static String searchingChallenge(String str) {
        int n = str.length();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(str, i, j) && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }

        if (maxLength > 2) {
            return str.substring(start, start + maxLength);
        } else {
            return "none";
        }
    }

    private static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String combineWithChallengeToken(String result, String challengeToken) {
        StringBuilder combined = new StringBuilder(result);
        combined.reverse();
        return combined + ":" + new StringBuilder(challengeToken).reverse().toString();
    }
}

