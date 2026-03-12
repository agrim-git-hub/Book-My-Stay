/**
 * ================================================================
 * CLASS - AddOnService
 * ================================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * This class represents an optional service
 * that can be added to a confirmed reservation.
 *
 * Examples:
 * - Breakfast
 * - Spa
 * - Airport Pickup
 *
 * @author Developer
 * @version 7.0
 */
public class AddOnService {

    /**
     * Name of the add-on service.
     */
    private String serviceName;

    /**
     * Cost of the service.
     */
    private double cost;

    /**
     * Creates a new add-on service.
     *
     * @param serviceName name of the service
     * @param cost        cost of the service
     */
    public AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    /**
     * Gets the service name.
     *
     * @return service name
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Gets the service cost.
     *
     * @return service cost
     */
    public double getCost() {
        return cost;
    }
}