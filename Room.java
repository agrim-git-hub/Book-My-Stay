/**
 * ================================================================
 * ABSTRACT CLASS - Room
 * ================================================================
 *
 * Description:
 * This abstract class represents a generalized room concept
 * in the Hotel Booking Management System.
 *
 * It defines common attributes and behavior shared by all
 * room types while preventing direct instantiation.
 *
 * Key attributes include:
 * - Room type (Single, Double, Suite)
 * - Number of beds
 * - Room size in square meters
 * - Base price per night
 *
 * This abstraction enables polymorphism and consistent
 * handling of different room implementations.
 *
 * @author Developer
 * @version 2.0
 */
public abstract class Room {

    /**
     * The type of the room (e.g., "Single", "Double", "Suite").
     */
    protected String type;

    /**
     * The number of beds in the room.
     */
    protected int beds;

    /**
     * The size of the room in square meters.
     */
    protected double size;

    /**
     * The base price per night for the room.
     */
    protected double price;

    /**
     * Constructor for Room.
     *
     * @param type  The room type
     * @param beds  Number of beds
     * @param size  Room size in sqm
     * @param price Base price per night
     */
    public Room(String type, int beds, double size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    /**
     * Gets the room type.
     *
     * @return The room type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the number of beds.
     *
     * @return Number of beds
     */
    public int getBeds() {
        return beds;
    }

    /**
     * Gets the room size.
     *
     * @return Room size in sqm
     */
    public double getSize() {
        return size;
    }

    /**
     * Gets the base price.
     *
     * @return Base price per night
     */
    public double getPrice() {
        return price;
    }

    /**
     * Displays room details.
     */
    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqm");
        System.out.println("Price: $" + price + " per night");
    }
}