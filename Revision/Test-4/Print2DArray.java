public class Print2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                    {4,5,6},
                    {6,7,8}};

        printArray(arr);
    }
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                for (int k = 0; k < arr[i].length; k++) {
                    System.out.print(arr[i][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
