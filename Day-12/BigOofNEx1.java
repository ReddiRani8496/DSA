public class BigOofNEx1 {
    public static void main(String[] args) {

    }

    void show(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);

    }
}

/*
Time Complexity:
---------------

O(n) + O(n)

O(2n) // then remove coefficient

O(n)
 */
