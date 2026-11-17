
//Write a function to print the sum of all odd numbers from 1 to n. 
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = calculateSumOfOddNumbers(n);
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
    }
    
    public static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    
    
}
