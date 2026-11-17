import java.util.Scanner;

public class max_minElement {
    public static void main(String[] args) {
        
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the size of array");
       int n =sc.nextInt();

       int arr[]=new int[n];
       System.out.println("enter" +n+ "integer");
       
       for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }

       int min =arr[0];
       int max = arr[0];

       for(int i=1; i<n; i++){
        if (arr[i] >max){
            max=arr[i];
        }
        if (arr[i] <min){
            min=arr[i];
          }
       }

       System.out.println("maximum :" + max);
       System.out.println("minimum" + min);
        
    }
    
}
