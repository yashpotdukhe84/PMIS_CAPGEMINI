public class problem {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal =7000;

        try{
            if (withdrawal > balance){
                throw new IllegalArgumentException(
                    "insuffcient balance"
                );
            }
            balance -= withdrawal;
            System.out.println("withdrawal succussful");
            System.out.println("Remaining bal" + balance);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("program completed");
    }
}
