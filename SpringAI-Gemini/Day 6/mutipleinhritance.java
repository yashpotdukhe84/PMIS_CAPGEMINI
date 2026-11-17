interface mother{
    void message();
}

interface father{
    void message();
}


//using interface we achevie multiple inheritnace    if 
class child implements mother,father{
    @Override 
    public void message(){
        System.out.println("loveing both mom and dad");
    }
}

public class mutipleinhritance {
     public static void main(String[] args) {
        child c =new child();
        c.message();
        mother m = new child();
        m.message();
        father f =new  child();
        f.message();
        
     }
}