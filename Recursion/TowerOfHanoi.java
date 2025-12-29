public class TowerOfHanoi {
     public static void main(String[] args) {
      towerOfHanoi(7,'A','B','C');

    }
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
            if(n==1) {
                System.out.println(source+"->"+destination);
                return;
            }

            towerOfHanoi(n-1,source,destination,helper);
            towerOfHanoi(1,source,helper,destination);
            towerOfHanoi(n-1,helper,source,destination);

    }
}
