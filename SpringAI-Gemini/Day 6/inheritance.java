
class animals{
    void  eat(){
        System.out.println("this animal eat food");
    }
}

class dog extends animals{
    void  bark(){
        System.out.println("the dogs bark");
    }
}

public  class inheritance{
    public static void main(String[] args) {
        dog myDog =new dog();
        myDog.eat();
        myDog.bark();
    }

    
}
