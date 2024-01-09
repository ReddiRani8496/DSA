public class GameStrategy {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 4};
        int n = arr.length;
        if(isWinningStrategy(arr)) {
            System.out.println("YES");
            System.out.println(minSwaps(arr));
        } else {
            System.out.println("No");
        }
    }

    private static boolean isWinningStrategy(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            if(arr[i]==i+1) {
                continue;
            }
            int diff = Math.abs(arr[i]-(i+1));
            if(diff>2) {
                return false;
            }
        }
        return true;
    }
    
    private static int minSwaps(int[] arr) {
        int n = arr.length;
        int swaps=0;
        for (int i = 0; i < n; i++) {
            while (arr[i]!=i+1) {
                int temp = arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
                swaps++;
            }
        }
        return swaps;
    }
}
