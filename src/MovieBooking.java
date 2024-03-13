import java.util.HashMap;
import java.util.Map;

public class MovieBooking {
    private Map<String, Movie> movies;

    public MovieBooking(){
        movies =  new HashMap<>();
    }

    public Map<String, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<String, Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(MovieTime movie){
        movies.put(movie.getTitle(), movie);
    }

    public void bookMovie(String title){
        Movie movie = movies.get(title);
        if (movie != null) {
            movie.bookSeat();
        } else {
            System.out.println("Movie not found.");
        }
    }

    public void printMovieDetails(String title){
        Movie movie = movies.get(title);
        if (movie instanceof MovieTime) {
            ((MovieTime) movie).printDetails();
        } else {
            System.out.println("Movie not found.");
        }
    }

    public void listMovies() {
        System.out.println("Available Movies:");
        for (Movie movie : movies.values()) {
            System.out.println("- " + movie.getTitle());
        }
    }
}
