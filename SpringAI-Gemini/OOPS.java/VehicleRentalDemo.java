
import java.util.ArrayList;
import java.util.List;

// Interface
interface Rentable {
    double calculateRent(int days);
    boolean isAvailable();
}

// Abstract class
abstract class Vehicle implements Rentable {
    protected String id;
    protected String model;
    protected double dailyRate;
    protected boolean available = true;

    public Vehicle(String id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getDetails() {
        return getClass().getSimpleName() + " "
                + model + " (" + id + ")";
    }
}

// Car
class Car extends Vehicle {
    public Car(String id, String model, double rate) {
        super(id, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        return dailyRate * days;
    }
}

// Bike
class Bike extends Vehicle {
    public Bike(String id, String model, double rate) {
        super(id, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = dailyRate * days;

        if (days >= 7) {
            rent = rent - (rent * 0.10);
        }

        return rent;
    }
}

// Truck
class Truck extends Vehicle {
    public Truck(String id, String model, double rate) {
        super(id, model, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (dailyRate * days) + 500;
    }
}

// Customer
class Customer {
    private String name;
    private List<Rental> rentalHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentalHistory.add(rental);
    }

    public List<Rental> getRentalHistory() {
        return rentalHistory;
    }
}

// Rental
class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double rent;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.rent = vehicle.calculateRent(days);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getRent() {
        return rent;
    }
}

// Custom exception
class VehicleNotAvailableException extends Exception {
    public VehicleNotAvailableException(String message) {
        super(message);
    }
}

// Rental shop
class RentalShop {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days)
            throws VehicleNotAvailableException {

        if (days <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be greater than zero");
        }

        Vehicle selected = null;

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equalsIgnoreCase(vehicleId)) {
                selected = vehicle;
                break;
            }
        }

        if (selected == null) {
            throw new VehicleNotAvailableException(
                    "Vehicle " + vehicleId + " not found");
        }

        if (!selected.isAvailable()) {
            throw new VehicleNotAvailableException(
                    selected.getDetails() + " is already rented");
        }

        Rental rental = new Rental(selected, customer, days);
        selected.setAvailable(false);
        customer.addRental(rental);

        return rental;
    }

    public void giveBack(String vehicleId)
            throws VehicleNotAvailableException {

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equalsIgnoreCase(vehicleId)) {
                if (vehicle.isAvailable()) {
                    throw new VehicleNotAvailableException(
                            vehicle.getDetails() + " is not rented");
                }

                vehicle.setAvailable(true);
                System.out.println(
                        vehicle.getDetails() + " returned successfully");
                return;
            }
        }

        throw new VehicleNotAvailableException(
                "Vehicle " + vehicleId + " not found");
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle.getDetails());
            }
        }
    }
}

// Main class
public class VehicleRentalDemo {
    public static void main(String[] args) {

        RentalShop shop = new RentalShop();

        Car car = new Car("C1", "Swift", 2000);
        Bike bike = new Bike("B1", "Activa", 400);
        Truck truck = new Truck("T1", "Tata Ace", 2500);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            Rental r1 = shop.rent("B1", asha, 8);
            System.out.printf(
                    "%s rented %s for %d days = %.2f%n",
                    r1.getCustomer().getName(),
                    r1.getVehicle().getDetails(),
                    r1.getDays(),
                    r1.getRent()
            );

            Rental r2 = shop.rent("T1", ravi, 2);
            System.out.printf(
                    "%s rented %s for %d days = %.2f%n",
                    r2.getCustomer().getName(),
                    r2.getVehicle().getDetails(),
                    r2.getDays(),
                    r2.getRent()
            );

            shop.rent("B1", ravi, 3);

        } catch (VehicleNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.showAvailable();
    }
}
