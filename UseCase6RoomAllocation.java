/**
 * ================================================================
 * MAIN CLASS - UseCase6RoomAllocation
 * ================================================================
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Description:
 * This class demonstrates how booking
 * requests are confirmed and rooms
 * are allocated safely.
 *
 * It consumes booking requests in FIFO
 * order and updates inventory immediately.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6RoomAllocation {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Room Allocation Processing");

        // prepare inventory and request queue
        RoomInventory inventory = new RoomInventory();
        BookingRequestQueue queue = new BookingRequestQueue();

        // prepare some booking requests in FIFO order
        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        RoomAllocationService allocator = new RoomAllocationService();

        while (queue.hasPendingRequests()) {
            Reservation req = queue.getNextRequest();
            allocator.allocateRoom(req, inventory);
        }
    }
}