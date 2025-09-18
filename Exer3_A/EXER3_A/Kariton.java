public class Kariton extends LandTransport {
    String size;
    String manufacturer;

    public Kariton(String brand, double speed, int capacity, String size, String manufacturer) {
        super(brand, speed, capacity);
        this.size = size;
        this.manufacturer = manufacturer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size + ", Manufacturer: " + manufacturer);
    }
}