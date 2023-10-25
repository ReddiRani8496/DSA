import java.util.HashMap;
import java.util.Scanner;

public class MostRepeatedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(mostRepeatedWord(str));

    }
    public static String mostRepeatedWord(String str) {
        String res[] = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
       for(var x:res){
           if(map.containsKey(x)) {
               int value = map.get(x);
               map.put(x,value+1);
           }
           else {
               map.put(x,0);
           }
       }
       int max = Integer.MIN_VALUE;
       String str1="";
       for(var x : map.entrySet()) {
           if(x.getValue()>max) {
               max = x.getValue();
               str1=x.getKey();
           }
       }
       return str1;
    }
}

