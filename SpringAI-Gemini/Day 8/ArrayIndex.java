public class ArrayIndex {
    public static void main(String[] args) {
        try{
            int res = 10/0;
            System.out.println(res);

            int [] numbers={10,20,30};
            System.out.println(numbers[5]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index");

        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }finally{
            System.out.println("program executed");
        }
    }
    
}
