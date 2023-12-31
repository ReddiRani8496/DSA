//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrintNumbers {
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }

    private static void printNumbers(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNumbers(n-1);
        System.out.print(n+" ");
    }
}
