public class ArrayWithoutColSize {

    public static void main(String[] args) {

        int[][] arr = new int[4][]; // it has length 4, inside that locations array size 0

        System.out.println(arr.length); // length = number of rows i.e. 4

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // return the references of 2d array, since it doesn't have array in heap, it will return null
        }

        // if we try to access element at null object, it will throw null pointer exception
       // System.out.println(arr[0][2]);

        // we can declare one dimensional array, at each row
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[5]; // array with length 5 is created in each row
        }

        // default value of integer array is 0
        System.out.println(arr[0][2]);
    }
}
