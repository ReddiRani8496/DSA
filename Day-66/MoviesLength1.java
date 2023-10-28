import java.util.HashSet;

public class MoviesLength1 {
    public static void main(String[] args) {
        int movieLength = 120;
        int[] movies = {70,40,60,50,30};
        System.out.println(isWatchTwoMovies(movies,movieLength));
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
}
