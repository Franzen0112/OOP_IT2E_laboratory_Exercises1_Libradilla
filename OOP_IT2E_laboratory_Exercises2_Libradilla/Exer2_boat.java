public class Boat {
    private String color;
    private String boatName;
    private String boatType;
    private int capacity;
    private String registrationNo;

    // No-argument constructor
    public Boat() {
        this.color = "No Color";
        this.boatName = "Unnamed Boat";
        this.boatType = "Unknown Type";
        this.capacity = 0;
        this.registrationNo = "No Registration";
    }

    // Constructor with arguments
    public Boat(String color, String boatName, String boatType, int capacity, String registrationNo) {
        this.color = color;
        this.boatName = boatName;
        this.boatType = boatType;
        this.capacity = capacity;
        this.registrationNo = registrationNo;
    }

    // Method to display boat info
    public void displayInfo() {
        String info = "";
        info += "Boat Name: " + this.boatName;
        info += "\nColor: " + this.color;
        info += "\nType: " + this.boatType;
        info += "\nCapacity: " + this.capacity + " persons";
        info += "\nRegistration No: " + this.registrationNo;
        System.out.println(info);
    }
}
public class BoatTester {
    public static void main(String[] args) {
        // Using constructor with arguments
        Boat b1 = new Boat("White", "Sea Explorer", "Yacht", 12, "REG2025-001");

        
        Boat b2 = new Boat();

        // Display info of both objects
        b1.displayInfo();
        System.out.println("--------------------");
        b2.displayInfo();
    }
}
