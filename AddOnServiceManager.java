/**
 * ================================================================
 * CLASS - AddOnServiceManager
 * ================================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * This class manages optional services
 * associated with confirmed reservations.
 *
 * It supports attaching multiple services
 * to a single reservation.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class AddOnServiceManager {

    /**
     * Maps reservation ID to selected services.
     *
     * Key   -> Reservation ID
     * Value -> List of selected services
     */
    private Map<String, List<AddOnService>> servicesByReservation;

    /**
     * Initializes the service manager.
     */
    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    /**
     * Attaches a service to a reservation.
     *
     * @param reservationId confirmed reservation ID
     * @param service       add-on service
     */
    public void addService(String reservationId, AddOnService service) {
        servicesByReservation.computeIfAbsent(reservationId, k -> new ArrayList<>()).add(service);
    }

    /**
     * Calculates total add-on cost
     * for a reservation.
     *
     * @param reservationId confirmed reservation ID
     * @return total service cost
     */
    public double calculateTotalServiceCost(String reservationId) {
        List<AddOnService> services = servicesByReservation.get(reservationId);
        if (services == null) {
            return 0.0;
        }
        return services.stream().mapToDouble(AddOnService::getCost).sum();
    }
}