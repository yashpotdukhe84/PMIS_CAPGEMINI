
import java.util.Scanner;

public class Wapperclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by commas:");
        String input = sc.nextLine();

        String[] numbers = input.split(",");
        int sum = 0;

        for (String num : numbers) {
            sum += Integer.parseInt(num.trim());
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }   
}
