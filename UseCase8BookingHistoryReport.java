/**
 * ================================================================
 * MAIN CLASS - UseCase8BookingHistoryReport
 * ================================================================
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * This class demonstrates how
 * confirmed bookings are stored
 * and reported.
 *
 * The system maintains an ordered
 * audit trail of reservations.
 *
 * @author Developer
 * @version 8.0
 */

public class UseCase8BookingHistoryReport {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Booking History and Reporting\n");

        // initialize booking history
        BookingHistory history = new BookingHistory();

        // add confirmed reservations to history
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        // generate and display report
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history);
    }
}