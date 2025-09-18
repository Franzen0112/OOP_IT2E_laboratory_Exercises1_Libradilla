public class Ship extends WaterTransport {
    double length;
    double beam;

    public Ship(String brand, double speed, int capacity, double length, double beam) {
        super(brand, speed, capacity);
        this.length = length;
        this.beam = beam;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Length: " + length + "m, Beam: " + beam + "m");
    }
}