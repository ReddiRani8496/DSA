package Recursion;

public class NIsLucky {
    public static void main(String[] args) {
        System.out.println(findLucky(7,2));

    }
    public static boolean findLucky(int n, int counter) {
        if(n<counter) {
            return true;
        }
        
        if(n%counter==0) {
            return false;
        }
        
        return findLucky(n-(n/counter),counter);
    }
}
