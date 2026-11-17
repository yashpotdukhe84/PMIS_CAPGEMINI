import java.time.LocalDate;

public class customDate{
    public static void main(String[] args) {

        LocalDate customdate = LocalDate.of(2026, 12, 26);

        System.out.println(customdate);

        int dayOfMonth = customdate.getDayOfMonth();
        int month = customdate.getMonthValue();
        int year = customdate.getYear();

        System.out.println("Day: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}