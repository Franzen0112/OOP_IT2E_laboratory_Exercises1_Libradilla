public class SUV extends LandTransport {
    int seats;
    double luggageSpace;

    public SUV(String brand, double speed, int capacity, int seats, double luggageSpace) {
        super(brand, speed, capacity);
        this.seats = seats;
        this.luggageSpace = luggageSpace;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats + ", Luggage Space: " + luggageSpace + " L");
    }
}