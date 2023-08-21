// Two sum problem using naive approach

public class TwoSumEx1 {

    public static void main(String[] args) {

        int arr[]={7,4,9,5,3};
        int sum=9;

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Target found");
                    return;
                }
            }

        }

        System.out.println("Target not found");

    }
}
