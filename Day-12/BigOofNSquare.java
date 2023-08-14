public class BigOofNSquare {
    public static void main(String[] args) {

    }

    void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
    }
}

/*
Time complexity:
---------------

O(n) * O(n)

O(n * n)

O(n^2)
 */
