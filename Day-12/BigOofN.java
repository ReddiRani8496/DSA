public class BigOofN {
    public static void main(String[] args) {

    }

    void show(int[] arr) {

        System.out.println("Begin");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println("End");
    }

}

/*
Time complexity:
--------------

O(1)+O(n)+O(1)

O(2+n)

remove the constants or coefficients, we will get

O(n) as time complexity.

For ex, if equation is : O(2n+4+n/2) -> O(n+n) //because coefficients and constants removed, then

                         -> O(2n) -> O(n)
 */
