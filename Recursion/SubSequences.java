package Recursion;

import java.util.Scanner;

public class SubSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        String ans = "";
        subsequences(str,ans);
    }
    public static void subsequences(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        subsequences(str.substring(1),ans+str.charAt(0));
        subsequences(str.substring(1), ans);
    }
}
