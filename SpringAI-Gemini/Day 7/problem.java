class userAccount{
    
   private  String username;
   private  static  int totaluser=0;   
   
  public  userAccount(String username){
    this.username=username;
    totaluser++;
   }

      // Getter method
    public String getUsername() {
        return username;
    }

     // Static method
    public static int getTotalUsers() {
        return totaluser;
    }
}

    public class problem{
        public static void main(String[] args) {
            System.out.println("inital user count " + userAccount.getTotalUsers());

            userAccount u1 = new userAccount("yash");
            userAccount u2 = new userAccount("aadi");
            userAccount u3 = new userAccount("varun");

            System.out.println("username  :" + u1.getUsername());
            System.out.println("username  :" + u2.getUsername());
            System.out.println("username :" + u3.getUsername());

            System.out.println("total users registered " + userAccount.getTotalUsers());
        }
    }