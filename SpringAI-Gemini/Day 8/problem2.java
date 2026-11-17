import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter first number");
        int a  = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        try{
            int result =a/b;
            System.out.println("result" + result);

        } catch(ArithmeticException e){
            System.out.println("Error cannot divide by 0");
        }
    }
}
