
//comman parent
class shape{
    String color="Blue";

}
class circle extends shape{
    void drawcircle(){
        System.out.println("Drawing a "+color+" cricle");
    }
}
class rectangle extends shape{
    void drawrectangle(){
        System.out.println("Drawing a "+color+" recatngle");
    }
}
public class Hierarchical {

    public static void main(String[] args) {
        circle c =new circle();
        rectangle r=new rectangle();
        c.drawcircle();
        r.drawrectangle();
    }
}