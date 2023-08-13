class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++) {          // time complexity O(n)
            sum += i;
        }
        System.out.println(sum);

        int sum1 = 0;
        for(int i = 1; i <= n; i++) {          // time complexity O(n^2)
            for(int j = i; j <= i; j++) {
                sum1 += j;
            }
        }
        System.out.println(sum1);

        int sum2 = (n*(n+1))/2;           // time complexity O(1)
        System.out.println(sum2);

    }
}

// we choose O(1)