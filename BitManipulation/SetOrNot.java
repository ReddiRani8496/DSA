package BitManipulation;

public class SetOrNot {
    public static void main(String[] args) {
        int num = 20;
        int index = 3;
        int mask = 1<<index;
        if((num&mask)!=0)
            System.out.println("Set");
        else
            System.out.println("Unset");
    }
}
