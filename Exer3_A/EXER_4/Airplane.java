public class Airplane extends AirTransport {
    double wingspan;
    double cruiseSpeed;
    double altitude;

    public Airplane(String brand, double speed, int capacity, double wingspan, double cruiseSpeed, double altitude) {
        super(brand, speed, capacity);
        this.wingspan = wingspan;
        this.cruiseSpeed = cruiseSpeed;
        this.altitude = altitude;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + "m, Cruise Speed: " + cruiseSpeed + " km/h, Altitude: " + altitude + " ft");
    }
}