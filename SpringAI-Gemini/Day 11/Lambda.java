
// interface Greeter{
//     void greet(String name);

//

// public class Lambda {
//     public static void main(String[] args) {
//         Greeter g = new Greeter(){
//             @override 
//             public void greet (String name){
//                 System.out.println("Yash")
//             }
//         }
        
//     }
    
// }


// public class Lambda{
//     public static void main(String[] args){
//         Greeter g = name -> System.out.println("hello, " + name );
//             g.greet("Yash");
//         }
//     }
  


// import Java.util.Function.*;
// class Lambda{
//     public static void main(String[] args){
//         Function<String, Integer> getLength= name -> name.length();

    
//         System.out.println(getLength.apply("Java"));
//         System.out.println(getLength.apply("jon"));
//     }
// }



interface square{
    int cal (int n);
}
public class Lambda{
    public static void main(String[] args){
        square s = n -> n*n;
        System.out.println(s.cal(20));
    }
}