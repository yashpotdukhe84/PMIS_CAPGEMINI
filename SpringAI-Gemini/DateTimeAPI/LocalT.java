import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalT {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Date and Time: " + dateTime);
    }
}