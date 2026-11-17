
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

        // Attempt to rent an already rented bike
        shop.rent("B1", ravi, 3);

    } catch (VehicleNotAvailableException e) {
        System.out.println("Error: " + e.getMessage());

    } catch (IllegalArgumentException e) {
        System.out.println("Invalid input: " + e.getMessage());
    }

    shop.showAvailable();

    // Return bike
    try {
        shop.giveBack("B1");
    } catch (VehicleNotAvailableException e) {
        System.out.println("Error: " + e.getMessage());
    }

    shop.showAvailable();
}
