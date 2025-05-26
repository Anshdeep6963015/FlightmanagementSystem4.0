package admin;
import java.io.*;
import java.util.*;
class Flight {
    public String source;
    public String destination;

    public Flight(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
}
class FlightManagementSystem {
    // This should be replaced with actual logic to fetch a flight by ID
    public static Flight getFlightById(String flightID) {
        // Dummy implementation for compilation
        return new Flight("INDIA", "USA");
    }
}


public class AdminAnalytics {

    public static void showAdminDashboard() {
        String logFile = "booking_log.txt";
        int totalBookings = 0;
        double totalRevenue = 0.0;

        Map<String, Integer> seatClassMap = new HashMap<>();
        Map<String, Integer> foodMap = new HashMap<>();
        Map<String, Integer> flightBookingCount = new HashMap<>();
        Map<String, Integer> routeBookingCount = new HashMap<>(); // ✅ new map for route counts

        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty())
                    continue;
                totalBookings++;

                // B1,FL102,ansh,Economy,Veg
                String[] parts = line.split(",");
                if (parts.length < 5)
                    continue;

                String bookingID = parts[0].trim();
                String flightID = parts[1].trim();
                String passenger = parts[2].trim();
                String seatClass = parts[3].trim();
                String food = parts[4].trim();

                // ✅ Get the route (source -> destination) using the flightID
                Flight flight = FlightManagementSystem.getFlightById(flightID);
                if (flight != null) {
                    String route = flight.source + " -> " + flight.destination;
                    routeBookingCount.put(route, routeBookingCount.getOrDefault(route, 0) + 1);
                }

                double amount = 0;
                switch (seatClass.toLowerCase()) {
                    case "economy":
                        amount = 5200;
                        break;
                    case "business":
                        amount = 8200;
                        break;
                    case "first":
                        amount = 12200;
                        break;
                }

                totalRevenue += amount;

                // Count flight bookings
                flightBookingCount.put(flightID, flightBookingCount.getOrDefault(flightID, 0) + 1);

                // Count seat class
                seatClassMap.put(seatClass, seatClassMap.getOrDefault(seatClass, 0) + 1);

                // Count food preference
                foodMap.put(food, foodMap.getOrDefault(food, 0) + 1);
            }

            System.out.println("\n===== Admin Dashboard =====");
            System.out.println(" Total Bookings: " + totalBookings);
            System.out.printf(" Total Revenue: Rs%.2f%n", totalRevenue);

            // ✅ Most Popular Route
            if (!routeBookingCount.isEmpty()) {
                String topRoute = Collections.max(routeBookingCount.entrySet(), Map.Entry.comparingByValue()).getKey();
                System.out.println(" Most Popular Route: " + topRoute + " (" + routeBookingCount.get(topRoute) + " bookings)");
            } else {
                System.out.println(" Most Popular Route: No data");
            }

            // Most booked flight
            if (!flightBookingCount.isEmpty()) {
                String topFlight = Collections.max(flightBookingCount.entrySet(), Map.Entry.comparingByValue())
                        .getKey();
                System.out.println(
                        " Most Booked Flight: " + topFlight + " (" + flightBookingCount.get(topFlight) + " bookings)");
            } else {
                System.out.println(" Most Booked Flight: No data");
            }

            System.out.println("\n Seat Class Distribution:");
            if (!seatClassMap.isEmpty()) {
                for (Map.Entry<String, Integer> entry : seatClassMap.entrySet()) {
                    System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
                }
            } else {
                System.out.println(" No seat class data available.");
            }

            System.out.println("\n Food Preferences:");
            if (!foodMap.isEmpty()) {
                for (Map.Entry<String, Integer> entry : foodMap.entrySet()) {
                    System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
                }
            } else {
                System.out.println(" No food preference data available.");
            }

        } catch (IOException e) {
            System.out.println("Error reading log file: " + e.getMessage());
        }
    }
}
