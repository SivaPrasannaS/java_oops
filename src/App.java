import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        MovieBooking movieBooking = new MovieBooking();
        
        MovieTime movieTime= new MovieTime();
        movieTime.setTitle("Inception");
        movieTime.setDirector("Christopher Nolan");
        movieTime.setSeatsAvailable(100);
        movieTime.setMovieType(MovieType.Thriller);
        movieTime.setTime(new Date()); 

        movieBooking.addMovie(movieTime);
        movieBooking.listMovies();
        movieBooking.bookMovie("Inception");
        movieBooking.printMovieDetails("Inception");
    }
}
