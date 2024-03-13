import java.util.Date;

public class MovieTime extends Movie{
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void printDetails() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("Director: " + super.getDirector());
        System.out.println("Available Seats: " + super.getSeatsAvailable());
        System.out.println("Time: " + time);
    }
}
