import java.util.Scanner;

public class ninth {

   
    public static int power(int x, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}