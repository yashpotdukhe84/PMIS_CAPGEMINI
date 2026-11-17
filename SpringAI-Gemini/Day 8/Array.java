import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements");
        int n= sc.nextInt();

        int arr[]=new int [n];
        int sum=0;

        System.out.println("enter" + n + "interger");
        
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        double average = (double)sum/n;
        System.out.println("sum= "+sum);
        System.out.println("average" +average);
        
    }
}
