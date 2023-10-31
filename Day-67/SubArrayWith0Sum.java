import java.util.HashSet;

public class SubArrayWith0Sum {
    public static void main(String[] args) {

        int[] arr = {4,-3,2,1,1,6};
        System.out.println(isSumZero(arr));

    }

    public static boolean isSumZero(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for(var x:arr) {
            sum += x;

            if(x==0 || sum==0 || set.contains(sum))
                return true;

            set.add(sum);
        }
        
        return false;
    }
}

