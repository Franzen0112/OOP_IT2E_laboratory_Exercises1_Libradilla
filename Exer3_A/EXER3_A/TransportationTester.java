public class TransportationTester {
    public static void main(String[] args) {
        // AIR TRANSPORT
        Airplane airplane = new Airplane("Boeing", 900, 180, 60, 850, 35000);
        Helicopter helicopter = new Helicopter("Airbus", 250, 5, 14, 1500, 15000);

        // LAND TRANSPORT
        Truck truck = new Truck("Volvo", 110, 4, 20, 420, 12);
        SUV suv = new SUV("Toyota", 180, 7, 7, 500);
        Tricycle tricycle = new Tricycle("Honda", 60, 3, 200, 80, "Covered");
        Motorcycle motorcycle = new Motorcycle("Honda", 250, 3, 600, 220, 180);
        Kariton kariton = new Kariton("Local", 10, 3, "Small", "Handmade");

        // WATER TRANSPORT
        Boat boat = new Boat("SpeedBoat", 70, 8, 3, 10);
        Ship ship = new Ship("Titanic", 40, 3000, 269, 28);

        // DISPLAY ALL TRANSPORTS BY GROUP
        // ================================
        System.out.println("AIR TRANSPORT ===");
        System.out.println("Airplane:");
        airplane.displayInfo();
        System.out.println();
        System.out.println("Helicopter:");
        helicopter.displayInfo();
        System.out.println();

        System.out.println("=== LAND TRANSPORT ===");
        System.out.println("Truck:");
        truck.displayInfo();
        System.out.println();
        System.out.println("SUV:");
        suv.displayInfo();
        System.out.println();
        System.out.println("Tricycle:");
        tricycle.displayInfo();
        System.out.println();
        System.out.println("Motorcycle:");
        motorcycle.displayInfo();
        System.out.println();
        System.out.println("Kariton:");
        kariton.displayInfo();
        System.out.println();

        System.out.println("=== WATER TRANSPORT ===");
        System.out.println("Boat:");
        boat.displayInfo();
        System.out.println();
        System.out.println("Ship:");
        ship.displayInfo();
    }
}