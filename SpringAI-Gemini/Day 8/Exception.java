//Arthimatic Exception
//null pointer 
//Arrayout of bounds Exception   ............by using try and catch block 

public class Exception{
    public static void main(String[] args) {
        int a =10;
        int b =0;

        try{
            int rest =a/b;
            System.out.println(rest);

        }
        catch(ArithmeticException e){
            System.out.println("you can not divide by 0");
        }
        
    }
}