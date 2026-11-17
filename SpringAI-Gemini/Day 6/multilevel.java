class device{
    void  poweron(){
        System.out.println("device powerd on");
    }

}

class Dabbaphone extends device{
    void makecall(){
        System.out.println("calling the number");
    }

}

class smartphone extends Dabbaphone{
    void browserinternet(){
        System.out.println("opeining browser");
    }

}

public class multilevel{
    public static void main(String[] args) {
        smartphone samsingh = new smartphone();
        samsingh.makecall();
        samsingh.browserinternet();
        samsingh.poweron();
    }
}