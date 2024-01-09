import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int arr[] = {2,2,4};
        int n = arr.length;
        int a = -1, b=-1,c=-1;
        int maxPerimeter = -1;
        Arrays.sort(arr);

        for (int i = n-1; i >= 2; i--) {
            int x = arr[i];
            int y = arr[i-1];
            int z = arr[i-2];
            if(x<y+z) {
                int currenPerimeter = x+y+z;
                if(currenPerimeter>maxPerimeter) {
                    a=z;
                    b=y;
                    c=x;
                    maxPerimeter=currenPerimeter;
                } else if(currenPerimeter==maxPerimeter) {
                    if(x>c ||(x==c && y>b) || (x==c && y==b && z>c)) {
                        a = z;
                        b = y;
                        c = x;
                        maxPerimeter=currenPerimeter;
                    }
                }
            }
        }
        if(maxPerimeter==-1) {
            System.out.println(-1);
        } else {
            System.out.println(a+" "+b+" "+c);
        }
    }
}
