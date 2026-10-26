
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;


public class zonetime {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a time zone (e.g., America/New_York): ");
        String timeZone = sc.nextLine();
        
        try {
            ZoneId zoneId = ZoneId.of(timeZone);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            System.out.println("Current Date and Time in " + timeZone + ": " + zonedDateTime);
        } catch (Exception e) {
            System.out.println("Invalid time zone. Please enter a valid time zone.");
        }

    }
}
        



    //     ZonedDateTime now = ZonedDateTime.now();

    //     System.out.println(now);
      
    //     System.out.println("Current Date and Time with Time Zone: " + now);

    //     Set<String> zoneIds = ZoneId.getAvailableZoneIds();
    //     zoneIds.forEach(System.out::println);
    // }

