
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DateExplorer {

    static Scanner sc = new Scanner(System.in);
    static LocalDate date;

    public static void main(String[] args) {

        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        date = LocalDate.parse(input);

        int choice;

        do {
            System.out.println("\n===== Date Explorer =====");
            System.out.println("1. Display Month");
            System.out.println("2. Display Year");
            System.out.println("3. Display Day of Week");
            System.out.println("4. Check Leap Year");
            System.out.println("5. Look Back Months");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayMonth();
                    break;

                case 2:
                    displayYear();
                    break;

                case 3:
                    displayDayOfWeek();
                    break;

                case 4:
                    checkLeapYear();
                    break;

                case 5:
                    lookBackMonths();
                    break;

                case 6:
                    System.out.println("Exiting Date Explorer...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }

    static void displayMonth() {
        System.out.println("Month: " + date.getMonth());
    }

    static void displayYear() {
        System.out.println("Year: " + date.getYear());
    }

    static void displayDayOfWeek() {
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of Week: " + day);
    }

    static void checkLeapYear() {
        if (date.isLeapYear()) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }

    static void lookBackMonths() {
        System.out.print("Enter number of months to look back: ");
        int months = sc.nextInt();

        LocalDate pastDate = date.minusMonths(months);

        System.out.println("Previous date: " + pastDate);
    }
}
