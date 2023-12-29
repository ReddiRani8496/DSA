import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutationBruteForce {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int n = arr.length;
        int f = factorial(n);

        List<List<Integer>> permutationsList = new ArrayList<>();


        for (int i = 0; i < f; i++) {
            int temp = i;
            int[] permutationArray = Arrays.copyOf(arr,n);


            List<Integer> permutationList = new ArrayList<>();

            for (int j = n; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;

                permutationList.add(permutationArray[r]);
                removeElement(permutationArray, r);

                temp = q;
            }

            permutationsList.add(permutationList);
        }


        Collections.sort(permutationsList, (list1, list2) -> {
            for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                int cmp = Integer.compare(list1.get(i), list2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(list1.size(), list2.size());
        });


        int currentIndex = permutationsList.indexOf(getListFromArray(arr));


        if (currentIndex < permutationsList.size() - 1) {
            List<Integer> nextPermutation = permutationsList.get(currentIndex + 1);
            System.out.println(nextPermutation);
        } else {
            System.out.println(permutationsList.get(0));
        }
    }

    private static List<Integer> getListFromArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {
            list.add(value);
        }
        return list;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static void removeElement(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
