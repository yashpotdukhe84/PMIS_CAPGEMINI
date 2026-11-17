// Enter 3 numbers from the user & make a function to print their average
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average of the three numbers is: " + average);
    }
    
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}