 //print pattern like 1 in 1st row and 01 in 2nd row and 101 in 3rd row and 0101 in 4th row
  /**
   * Pattern9
   */
  public class Pattern9 {
    public static void main(String[] args) {
        
    
  
    
  
        int n=4;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if ((i+j)%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
    