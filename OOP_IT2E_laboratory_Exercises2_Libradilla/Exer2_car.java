public class Car {
    private String color;
    private String plateNo;
    private String chassisNo;
    private String vehicleNumber;     // bagong attribute
    private int vehicleCapacity;      // bagong attribute

    // No argument constructor
    public Car() {
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
        this.vehicleNumber = "No Vehicle Number";
        this.vehicleCapacity = 0; // default capacity
    }

    // Constructor with arguments
    public Car(String color, String plateNo, String chassisNo, String vehicleNumber, int vehicleCapacity) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.vehicleNumber = vehicleNumber;
        this.vehicleCapacity = vehicleCapacity;
    }

    // Display info method
    public void displayInfo() {
        String info = "";
        info += "Color: " + this.color;
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        info += "\nVehicle Number: " + this.vehicleNumber;
        info += "\nVehicle Capacity: " + this.vehicleCapacity;
        System.out.println(info);
    }
}
public class CarTester {
    public static void main(String[] args) {
        // Using constructor with arguments
        Car c1 = new Car("Yellow", "KAW12345", "CHS56789", "VHC001", 5);

        // Using no-argument constructor (default values)
        Car c2 = new Car();

        // Display info of both objects
        c1.displayInfo();
        System.out.println("--------------------");
        c2.displayInfo();
    }
}
