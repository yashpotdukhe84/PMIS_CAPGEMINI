//print pattern order like 12345 in 1st row and 1234 in 2nd row and so on
     /**
      * Pattern6
      */
     public class Pattern6 {
         public static void main(String[] agrs){

         
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i; j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
     
        
     }
    }
    