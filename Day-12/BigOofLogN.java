public class BigOofLogN {
    public static void main(String[] args) {
     int n = 1024;
     int count = 0;

        for (int i = 1; i < n; i*=2) {
            count++;
        }
        System.out.println(count);
    }
}
/*
The above loop executes for 10 times because

log 1024 base 2 is -> 2^x = 1024
                      2^x = 2^10
                      equating coefficients we get
                      x = 10

 Time complexity is O(logN)

 Basically an algorithm with logarithmic time complexity is far more efficient and scalable as n grows.
 */