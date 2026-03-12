/**
 * ================================================================
 * CLASS - RoomSearchService
 * ================================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class provides search functionality
 * for guests to view available rooms.
 *
 * It reads room availability from inventory
 * and room details from Room objects.
 *
 * No inventory mutation or booking logic
 * is performed in this class.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Map;

public class RoomSearchService {

    /**
     * Displays available rooms along with
     * their details and pricing.
     *
     * This method performs read-only access
     * to inventory and room data.
     *
     * @param inventory    centralized room inventory
     * @param singleRoom   single room definition
     * @param doubleRoom   double room definition
     * @param suiteRoom    suite room definition
     */
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        // Check and display Single Room availability
        if (availability.getOrDefault("Single", 0) > 0) {
            System.out.println("Single Room:");
            singleRoom.displayDetails();
            System.out.println("Available: " + availability.get("Single") + " rooms\n");
        }

        // Check and display Double Room availability
        if (availability.getOrDefault("Double", 0) > 0) {
            System.out.println("Double Room:");
            doubleRoom.displayDetails();
            System.out.println("Available: " + availability.get("Double") + " rooms\n");
        }

        // Check and display Suite Room availability
        if (availability.getOrDefault("Suite", 0) > 0) {
            System.out.println("Suite Room:");
            suiteRoom.displayDetails();
            System.out.println("Available: " + availability.get("Suite") + " rooms\n");
        }
    }
}