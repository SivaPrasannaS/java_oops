public class Movie {
    private String title;
    private String director;
    private int seatsAvailable;
    private MovieType movieType;

    public Movie() {
    }

    public Movie(String title, String director, int seatsAvailable, MovieType movieType) {
        this.title = title;
        this.director = director;
        this.seatsAvailable = seatsAvailable;
        this.movieType = movieType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public void bookSeat(){
        if (seatsAvailable > 0) {
            --seatsAvailable;
            System.out.println("Seat booked successfully");
        } else {
            System.out.println("No available seats for this movie.");
        }
    }
}
