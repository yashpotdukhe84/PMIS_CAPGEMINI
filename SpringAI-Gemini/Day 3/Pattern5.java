  //print pattern 1234 decreasing order on left side 
       public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}