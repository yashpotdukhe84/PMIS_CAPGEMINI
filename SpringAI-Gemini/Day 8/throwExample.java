import java.util.*;

public class throwExample {
    public static void main(String[] args){
        System.out.println("enter age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age <0){
            throw new IllegalArgumentException(
                "Age cannot be negtive"
            );
        }
        System.out.println("age:"+age);
    
    }
    
}
