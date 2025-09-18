public class Boat extends WaterTransport {
    double beam;
    double length;

    public Boat(String brand, double speed, int capacity, double beam, double length) {
        super(brand, speed, capacity);
        this.beam = beam;
        this.length = length;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Beam: " + beam + "m, Length: " + length + "m");
    }
}