public class Tricycle extends LandTransport {
    int capacityLoad;
    double topSpeed;
    String sideType;

    public Tricycle(String brand, double speed, int capacity, int capacityLoad, double topSpeed, String sideType) {
        super(brand, speed, capacity);
        this.capacityLoad = capacityLoad;
        this.topSpeed = topSpeed;
        this.sideType = sideType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacityLoad + ", Top Speed: " + topSpeed + " km/h, Sidecar: " + sideType);
    }
}