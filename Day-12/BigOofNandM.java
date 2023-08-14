public class BigOofNandM {
    public static void main(String[] args) {

    }

    void show(int[] arr, int[] arr1) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

/*
Time Complexity:
---------------

Here we don't  size of arr and arr1, we will consider size of arr as 'n' and arr1 is 'm', then

O(n) + O(m)

O(n+m)

if 'n' is big then time complexity will be "O(n)"

if 'm' is big then time complexity will be "O(m)"

if both equal then time complexity will be "O(n) or O(m)"

 */