import java.util.Random;
import java.util.function.*;


class suppilers{
    public static void main(String[] args) {
        Supplier<String> otpGen = () ->{
            Random random = new Random();
            int number = 10000 + random.nextInt(9000000);
            return String.valueOf(number);

            };

            String userotp = otpGen.get();
            System.out.println("The opt is " + userotp);
        }
    
    }
