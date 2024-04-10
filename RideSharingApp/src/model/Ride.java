package model;

import java.util.ArrayList;
import java.util.List;

public class Ride {
    private final String name;
    private final Vehicle vehicle;
    private final String origin;
    private final String destination;
    private int availableSeats;
    private List<String> usersTaken;

    public Ride(String name, Vehicle vehicle, String origin, String destination, int availableSeats) {
        this.name = name;
        this.vehicle = vehicle;
        this.origin = origin;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.usersTaken = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public List<String> getUsersTaken() {
        return usersTaken;
    }
}
