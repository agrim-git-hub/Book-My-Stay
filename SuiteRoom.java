/**
 * ================================================================
 * CONCRETE CLASS - SuiteRoom
 * ================================================================
 *
 * Description:
 * This class represents a Suite Room in the Hotel Booking
 * Management System.
 *
 * A Suite Room provides premium accommodations with
 * spacious living areas, multiple beds, and luxury amenities
 * for discerning guests.
 *
 * @author Developer
 * @version 2.0
 */
public class SuiteRoom extends Room {

    /**
     * Constructor for SuiteRoom.
     *
     * Initializes a Suite Room with predefined specifications:
     * - 2 beds
     * - 50 sqm size
     * - $300 base price
     */
    public SuiteRoom() {
        super("Suite", 2, 50.0, 300.0);
    }
}