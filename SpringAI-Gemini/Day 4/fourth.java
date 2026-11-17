public class fourth {
    //Write a function that takes in the radius as input and returns the circumference of a circle.

    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        double circumference = calculateCircumference(radius);
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
    }
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    
}
