public class Truck extends LandTransport {
    double capacityLoad;
    int horsePower;
    int wheelCount;

    public Truck(String brand, double speed, int capacity, double capacityLoad, int horsePower, int wheelCount) {
        super(brand, speed, capacity);
        this.capacityLoad = capacityLoad;
        this.horsePower = horsePower;
        this.wheelCount = wheelCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + capacityLoad + " tons, Horsepower: " + horsePower + ", Wheels: " + wheelCount);
    }
}