import java.util.Scanner;

public class Varibales {
    
    public static void main(String[] args) {

        float a = 6.5f;
        int b = 4;

        System.out.println(a + b);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        String nm = sc.nextLine();

        System.out.println("You entered: " + nm);
    }
    
}
