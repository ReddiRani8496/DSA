public class BigOofNCube {
    public static void main(String[] args) {

    }

    void show(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                for (int k = 0; k < arr.length; k++)
                    System.out.println(arr[j]);

    }
}

/*
Time complexity:
---------------

O(n) * O(n) * O(n)

O(n * n * n)

O(n^3)

 */
