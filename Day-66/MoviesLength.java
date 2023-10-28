public class MoviesLength {
    public static void main(String[] args) {
        int movieLength = 120;
        int[] movies = {70,40,60,50,30};
        System.out.println(isWatchTwoMovies(movies,movieLength));
    }
    public static boolean isWatchTwoMovies(int[] movies,int movieLength) {
        for (int i = 0; i < movies.length-1; i++) {
            for (int movie : movies) {
                if (movies[i] + movie == movieLength)
                    return true;
            }
        }
        return false;
    }
}
