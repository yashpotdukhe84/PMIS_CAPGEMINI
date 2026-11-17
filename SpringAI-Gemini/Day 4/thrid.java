public class thrid {
    //Write a function which takes in 2 numbers and returns the greater of those two. 
    public static void main(String[] args) {
        int num1 =10;
        int num2 =20;
        int greater = findGreater(num1, num2);
        System.out.println("The greater number is: " + greater);
    }
    
    public static int findGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
