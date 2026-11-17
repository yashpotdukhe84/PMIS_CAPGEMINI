// class animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }
// class dog extends animal {
//     void bark(){
//         System.out.println("dog is barking ");
//     }
// }

// class engine {
//     void start(){
//         System.out.println("engine is starting");
//     }
// }

// class car{
//     private  engine engines ;
//     car(){
//         this.engines= new engine();
//     }
//     void drive(){
//         engines.start();
//         System.out.println("car is moving");
//     }
// }

//    //main class.....
// public class relationships {

//     public static void main(String[] args) {
//         car c = new car();
//         c.drive();
//     }
// }



// 2nd question

// class address{
//     String city;
//     String state;
//     int pincode;
//     address(String city, String state,int pincode ){
//         this.city =city;
//         this.state=state;
//         this.pincode=pincode;
//     }
//     void displayadd(){
//         System.out.println(city+ "," + state+ " ,"+ pincode);
//     }
// }
// class student{
//     String name;
//     int rollnumber;
//     address add;

//     student(String name, int rollnumber, address add){
//         this.name=name;
//         this.rollnumber=rollnumber;
//         this.add=add;
//     }

//     void displayprofile(){
//         System.out.println("student" + name+ "\n roll no"+ rollnumber);
//         System.out.println("lives at");
//         add.displayadd();
//     }
// }

// public class relationships {
//     public static void main(String[] args) {

//         address home1Address = new address("Pune", "Maharashtra", 411001);

//         student yash = new student("Yash", 23, home1Address);

//         yash.displayprofile();

//     }
// }



class battery{
    int capcityMH;
    battery(int capcityMH){
        this.capcityMH=capcityMH;
    }
    void  drain(){
        System.out.println("battery used. \ncapcity remaining" +(capcityMH-100)+ "MH");
    }
}
class camera{
    int pix;
    camera(int pix){
        this.pix=pix;

    }
    void takephoto(){
        System.out.println("click.. capture a photo "+ pix + " sensor   ");
    }
}
class phone{
    String brand;
    battery batterys;
    camera cameras;

    phone(String brand, battery batterys, camera cameras){
        this.brand=brand;
        this.batterys=batterys;
        this.cameras=cameras;
    }

    void snap(){
    System.out.println(" [" + brand +"]" + "is active");
    cameras.takephoto();
    batterys.drain();
}

}


public  class relationships {
    public static void main(String[] args) {
          battery phbattery= new battery(100);
          camera phcam = new  camera(450);
          phone phone1 = new phone("motorola", phbattery, phcam);
          phone1.snap();
    }

}
