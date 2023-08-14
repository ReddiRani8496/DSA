public class BigOofNSquareEx {
    public static void main(String[] args) {

    }

    void show(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                System.out.println(arr[j]);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}

/*
Time complexity:
---------------

O(n) * O(n) + O(1)

O(n * n + 1)

O(n^2+1)

O(n^2)

 */
