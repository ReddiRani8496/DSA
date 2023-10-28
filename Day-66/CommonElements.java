public class CommonElements {
    public static void main(String[] args) {

        int[] arr = {1,54,23,98};
        int[] arr1 = {7,45,1,98};
        System.out.println(commonElement(arr,arr1));

    }

    public static boolean commonElement(int[] arr,int[] arr1) {

        for (int j : arr) {
            for (int k : arr1) {
                if (j == k) {
                    return true;

                }
            }
        }
        return false;
    }

}

