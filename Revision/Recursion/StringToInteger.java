public class StringToInteger {
    public static void main(String[] args) {
        String str ="123";
        System.out.println(stringToInteger(str));
    }

    private static int stringToInteger(String str) {
        if(str.length()==1)
            return str.charAt(0)-'0';
//        double y = stringToInteger(str.substring(1));
//        double x = str.charAt(0)-'0';
//        return (int)(x*Math.pow(10,str.length()-1)+y);
        return stringToInteger(str.substring(1))+(str.charAt(0)*10);


        // 30+20+1
    }
}
