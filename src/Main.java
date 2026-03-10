abstract class Room {
    private String type;
    private int beds;
    private double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Room Type: " + type + " | Beds: " + beds + " | Price: $" + price);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super("Single", 1, 100.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double", 2, 180.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite", 3, 350.0);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Book My Stay App - Version 2.0   ");
        System.out.println("========================================\n");

        Room single = new SingleRoom();
        Room dual = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        single.displayInfo();
        System.out.println("Availability: " + singleAvailability + " rooms left.");
        System.out.println("----------------------------------------");

        dual.displayInfo();
        System.out.println("Availability: " + doubleAvailability + " rooms left.");
        System.out.println("----------------------------------------");

        suite.displayInfo();
        System.out.println("Availability: " + suiteAvailability + " rooms left.");
        System.out.println("----------------------------------------");
    }
}