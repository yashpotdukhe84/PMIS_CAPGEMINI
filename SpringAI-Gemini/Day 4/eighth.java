 public class eighth {
    // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥 𝑛 .  
        public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        }
        
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;

        }
        return result;
    }
}

