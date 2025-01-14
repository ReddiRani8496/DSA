import java.util.Scanner;

public class ArrayElementAppearsTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isAppearsTwice(arr, size));
    }

    public static boolean isAppearsTwice(int[] arr, int size) {
      for(int i = 0; i < size; i++) {
          for(int j=i+1;j<size;j++) {
              if(arr[i] == arr[j]) {
                  return true;
              }
          }
      }
      return false;
    }
}
