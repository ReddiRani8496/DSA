public class Equation {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length-1; i++) {
            int sum = arr[i];
            for(int k=i+1;k<arr.length;k++) {
                sum += arr[k];
                for (int j = i + 2; j < arr.length - 1; j++) {
                    if (arr[j] + arr[j + 1] == sum)
                        System.out.println(arr[i] + " " + arr[i + 1] + " " +arr[j] + " " + arr[j + 1]);
                }
            }
        }
    }
}

