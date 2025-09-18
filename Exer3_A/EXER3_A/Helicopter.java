public class Helicopter extends AirTransport {
    double diameter;
    int enginePower;
    double altitude;

    public Helicopter(String brand, double speed, int capacity, double diameter, int enginePower, double altitude) {
        super(brand, speed, capacity);
        this.diameter = diameter;
        this.enginePower = enginePower;
        this.altitude = altitude;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rotor Diameter: " + diameter + "m, Engine Power: " + enginePower + "hp, Altitude: " + altitude + " ft");
    }
}