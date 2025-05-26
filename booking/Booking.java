package booking;

import java.io.FileWriter;
import java.io.IOException;

public class Booking {
    private String bookingId;
    private String passengerName;
    private String flightId;
    private String fromCity;
    private String toCity;
    private String seatClass;
    private int numberOfSeats;
    private String foodOption;
    private double paymentAmount;

    // Existing constructor
    public Booking(String bookingId, String passengerName, String flightId,
            String fromCity, String toCity,
            String seatClass, int numberOfSeats,
            String foodOption, double paymentAmount) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flightId = flightId;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.seatClass = seatClass;
        this.numberOfSeats = numberOfSeats;
        this.foodOption = foodOption;
        this.paymentAmount = paymentAmount;
    }

    // NEW constructor matching bookTicket() usage
    public Booking(String bookingId, String flightId, String passengerName, String seatClass, String foodOption) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.foodOption = foodOption;
        this.fromCity = "";
        this.toCity = "";
        this.numberOfSeats = 1;
        this.paymentAmount = 0.0;
    }

    // Factory method and other methods unchanged...

    public static Booking createBooking(String bookingId, String passengerName, String flightId,
            String fromCity, String toCity,
            String seatClass, int numberOfSeats,
            String foodOption, double paymentAmount) {
        return new Booking(bookingId, passengerName, flightId, fromCity, toCity,
                seatClass, numberOfSeats, foodOption, paymentAmount);
    }

    public void saveBookingToFile() {
        try (FileWriter fw = new FileWriter("booking_log.txt", true)) {
            fw.write(this.toFormattedString() + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error writing booking to log: " + e.getMessage());
        }
    }

    public String toFormattedString() {
        return String.format(
                "BookingID: %s | Name: %s | FlightID: %s | From: %s | To: %s | SeatClass: %s | Food: %s | Amount: %.2f",
                bookingId, passengerName, flightId, fromCity, toCity, seatClass, foodOption, paymentAmount);
    }

    @Override
    public String toString() {
        return bookingId + "," + passengerName + "," + flightId + "," + fromCity + "," + toCity + "," +
                seatClass + "," + numberOfSeats + "," + foodOption + "," + paymentAmount;
    }

    // Getters...

    public String getBookingId() {
        return bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getFoodOption() {
        return foodOption;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }
}
