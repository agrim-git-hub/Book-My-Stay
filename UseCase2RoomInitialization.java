/**
 * ================================================================
 * MAIN CLASS - UseCase2RoomInitialization
 * ================================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This class demonstrates object modeling through inheritance
 * and abstraction in the Hotel Booking Management System.
 *
 * The application:
 * - Creates room objects representing different room types
 * - Stores availability using simple variables
 * - Displays room details and availability information
 *
 * This use case introduces domain modeling concepts before
 * introducing data structures, allowing focus on design
 * rather than optimization.
 *
 * @author Developer
 * @version 2.1
 */
public class UseCase2RoomInitialization {

    /**
     * Application entry point.
     *
     * Demonstrates room object creation and static availability
     * management using simple variables.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Hotel Booking Management System v2.1 ===");
        System.out.println("Initializing room types and availability...\n");

        // Create room objects representing different room types
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability representation using simple variables
        // This intentionally demonstrates limitations of hardcoded state
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        // Display room details and availability
        System.out.println("--- Room Inventory ---");

        System.out.println("Single Room:");
        singleRoom.displayDetails();
        System.out.println("Available: " + singleRoomAvailable + " rooms");
        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleRoomAvailable + " rooms");
        System.out.println();

        System.out.println("Suite Room:");
        suiteRoom.displayDetails();
        System.out.println("Available: " + suiteRoomAvailable + " rooms");
        System.out.println();

        System.out.println("System initialization complete.");
    }
}