public class Keypad {
    static  String keypad[] = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int count = 0;
    public static void main(String[] args) {


        printKeypad("746","");
        System.out.println(count);

    }
    public static void printKeypad(String number, String ans) {
        if(number.isEmpty()) {
            count++;
            System.out.println(ans+" ");
            return;
        }
        String value = keypad[number.charAt(0)-48];
        for(int i=0;i<value.length();i++) {
            printKeypad(number.substring(1), ans + value.charAt(i));
        }
    }
}
