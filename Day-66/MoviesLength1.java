import java.util.HashSet;

public class MoviesLength1 {
    public static void main(String[] args) {
        int movieLength = 120;
        int[] movies = {70,40,60,10,30};
        System.out.println(isWatchTwoMovies1(movies,movieLength));
    }
    public static boolean isWatchTwoMovies(int[] movies,int movieLength) {
        HashSet<Integer> set = new HashSet<>();
       for(var x : movies)
           set.add(x);
       for(var y : movies) {
           int required = movieLength-y;
           if(set.contains(required) && required!=y)
               return true;
       }
        return false;
    }
    public static boolean isWatchTwoMovies1(int[] movies,int movieLength) {
        HashSet<Integer> set = new HashSet<>();

        for(var y : movies) {
            int required = movieLength-y;
            if(set.contains(required))
                return true;
            set.add(y);
        }
        return false;
    }
}
