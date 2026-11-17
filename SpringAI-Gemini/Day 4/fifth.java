
import java.util.Scanner;
public class fifth {
    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();


        boolean isEligible = checkVotingEligibility(age);
        if (isEligible) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }

    public static boolean checkVotingEligibility(int age) {
        return age > 18;
    }
}
