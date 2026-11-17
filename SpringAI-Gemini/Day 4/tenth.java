import java.util.Scanner;

public class tenth {

    public static void printFibonacciSeries(int n) {

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {

            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        printFibonacciSeries(n);
    }
}