package database;

import exception.DuplicateRide;
import exception.RideAlreadyAssigned;
import model.Ride;

import java.util.HashMap;
import java.util.Map;

public class RideData {

    Map<String, Ride> rideList;

    public RideData() {
        this.rideList = new HashMap<>();
    }

    public void addRide(Ride ride) {
        Ride existingRide = rideList.getOrDefault(ride.getVehicle().getVehicleNumber(), null);
        if (existingRide != null) {
            if (existingRide.getAvailableSeats() == ride.getAvailableSeats() &&
                existingRide.getDestination().equals(ride.getDestination()) &&
                existingRide.getOrigin().equals(ride.getOrigin())) {
                throw new DuplicateRide("Duplicate ride");
            }
            throw new RideAlreadyAssigned("The ride for vehicleNumber " + ride.getVehicle().getVehicleNumber() + " is alredy assigned");
        }
        rideList.put(ride.getVehicle().getVehicleNumber(), ride);
    }

    public Map<String, Ride> getRideList() {
        return rideList;
    }

    @Override
    public String toString() {
        return "RideData{" +
                "rideList=" + rideList +
                '}';
    }

}
