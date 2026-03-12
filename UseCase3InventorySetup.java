/**
 * ================================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ================================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class demonstrates how room availability
 * is managed using a centralized inventory.
 *
 * Room objects are used to retrieve pricing
 * and room characteristics.
 *
 * No booking or search logic is introduced here.
 *
 * @author Developer
 * @version 3.1
 */

import java.util.Map;

public class UseCase3InventorySetup {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Hotel Room Inventory Status ===\n");

        // create inventory component
        RoomInventory inventory = new RoomInventory();

        // create room instances for characteristics
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // retrieve availability map
        Map<String, Integer> availability = inventory.getRoomAvailability();

        // helper to display one room block
        displayRoomBlock(singleRoom, availability.get("Single"));
        displayRoomBlock(doubleRoom, availability.get("Double"));
        displayRoomBlock(suiteRoom, availability.get("Suite"));
    }

    private static void displayRoomBlock(Room room, Integer available) {
        System.out.println(room.getType() + " Room:");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqm");
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Available Rooms: " + available + "\n");
    }
}