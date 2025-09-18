public class Transportation {
    String brand;
    double speed;
    int capacity;

    public Transportation(String brand, double speed, int capacity) {
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h, Capacity: " + capacity);
    }
}