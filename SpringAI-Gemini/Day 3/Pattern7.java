 // print 1 is on frist row and 23 in 2nd row and 456 in 3rd row and 4 row 789
 /**
  * Pattern7
  */
 public class Pattern7 {
 
    
 public static void main(String[] args) {
     int n=4;
         int count=1;
          for(int i=0; i<n; i++)
          {
                for(int j=0; j<=i; j++)
                {
                 System.out.print(count);
                 count++;
                }
                System.out.println();
          }
    
 }
}
        