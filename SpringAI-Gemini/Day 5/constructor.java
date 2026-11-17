class Car {

    String color;
    String brand;
    int speed;

    // Constructor
    Car(String color, String brand, int speed) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println(brand + "\n" + color + "\n" + speed);
    }

    void accelerate(int incr) {
        int oldSpeed = speed;
        speed += incr;

        System.out.println("Original speed: " + oldSpeed);
        System.out.println(brand + " accelerated to " + speed + " km/hr");
    }
}

public class constructor {

    public static void main(String[] args) {

        Car c1 = new Car("Blue", "BMW", 360);

        c1.displayInfo();

        c1.accelerate(50);
    }
}