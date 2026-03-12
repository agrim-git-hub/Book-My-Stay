/**
 * ================================================================
 * CONCRETE CLASS - DoubleRoom
 * ================================================================
 *
 * Description:
 * This class represents a Double Room in the Hotel Booking
 * Management System.
 *
 * A Double Room accommodates two guests comfortably,
 * featuring two beds and moderate space for couples or
 * business travelers.
 *
 * @author Developer
 * @version 2.0
 */
public class DoubleRoom extends Room {

    /**
     * Constructor for DoubleRoom.
     *
     * Initializes a Double Room with predefined specifications:
     * - 2 beds
     * - 30 sqm size
     * - $150 base price
     */
    public DoubleRoom() {
        super("Double", 2, 30.0, 150.0);
    }
}