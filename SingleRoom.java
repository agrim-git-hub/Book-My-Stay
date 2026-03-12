/**
 * ================================================================
 * CONCRETE CLASS - SingleRoom
 * ================================================================
 *
 * Description:
 * This class represents a Single Room in the Hotel Booking
 * Management System.
 *
 * A Single Room is designed for individual occupancy,
 * featuring one bed and compact dimensions suitable for
 * solo travelers.
 *
 * @author Developer
 * @version 2.0
 */
public class SingleRoom extends Room {

    /**
     * Constructor for SingleRoom.
     *
     * Initializes a Single Room with predefined specifications:
     * - 1 bed
     * - 20 sqm size
     * - $100 base price
     */
    public SingleRoom() {
        super("Single", 1, 20.0, 100.0);
    }
}