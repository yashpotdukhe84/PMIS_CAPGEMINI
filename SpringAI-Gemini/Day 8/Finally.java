public class Finally {
    public static void main(String[] args) {
        try{
            int res = 10/0;
            System.out.println(res);

        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        finally{
            System.out.println("Finally block Executed");
        }
        

    }
}
