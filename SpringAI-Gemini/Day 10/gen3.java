class util{
    static <T> void  printtwice(T value){
        System.out.println(value);
        System.out.println(value);

    }
    static <T>   T firstof(T a , T b){
        return  b;
    }
}

public class gen3 {
    public static  void main(String[] args){
        util.printtwice("yash");
        // System.out.println(util.firstof("hii", "hello"));
    }
    
}
