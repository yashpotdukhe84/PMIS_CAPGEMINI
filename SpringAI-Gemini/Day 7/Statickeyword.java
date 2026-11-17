// static college = "IIT";
class student{
    String name;
    static  String collegeName = "IIT Bombay";
    student(String name){
        this.name=name;
        
    }

    void  stucol(){
        System.out.println(name + " studies in " + collegeName);
    }
}
 public class Statickeyword{
    public static void main(String [] args){
        student s1 = new student("Yash");
        student  s2 =new student("Aadi");
        s1.stucol();
        s2.stucol();

    }

}