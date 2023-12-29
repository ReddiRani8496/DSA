import java.util.Arrays;

public class ArrayPermutations {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = arr.length;
        int fact = factorial(n);
        for (int i = 0; i < fact; i++) {
            int temp =i;
            int permutation[] = Arrays.copyOf(arr,n);
            for (int j = n; j >= 1 ; j--) {
                int q = temp/j;
                int r = temp%j;
                System.out.print(permutation[r]+" ");
                removeElement(permutation,r);
                temp=q;
            }
            System.out.println();
        }
    }

    private static void removeElement(int[] permutation, int r) {
        for (int i = r; i < permutation.length-1; i++) {
            permutation[i]=permutation[i+1];
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
}

