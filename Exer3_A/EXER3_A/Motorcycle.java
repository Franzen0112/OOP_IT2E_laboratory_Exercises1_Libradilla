public class Motorcycle extends LandTransport {
    int engineSize;
    double topSpeed;
    double weight;

    public Motorcycle(String brand, double speed, int capacity, int engineSize, double topSpeed, double weight) {
        super(brand, speed, capacity);
        this.engineSize = engineSize;
        this.topSpeed = topSpeed;
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engineSize + "cc, Top Speed: " + topSpeed + " km/h, Weight: " + weight + " kg");
    }
}