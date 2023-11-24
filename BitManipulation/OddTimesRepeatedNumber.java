
public class OddTimesRepeatedNumber {
    public static void main(String[] args) {
        int arr[] ={3,9,8,3,6,9,9,8,6,5,6,5,6};
        int ans = arr[0];
        for(int i=0;i<arr.length;i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
