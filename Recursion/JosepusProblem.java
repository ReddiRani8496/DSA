package Recursion;

import java.util.Scanner;

public class JosepusProblem {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
       int survival =  findSurvival(n,k);
        System.out.println(survival);
    }

   static int findSurvival(int n,int k) {
        if(n==1) {
            return 0;
        }

        return (findSurvival(n-1,k) + k) %n;

    }
}