package model;

public class Vehicle {
    private User user;
    private String vehicleName;
    private String vehicleNumber;

    public Vehicle() {

    }

    public Vehicle(User user, String vehicleName, String vehicleNumber) {
        this.user = user;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    public User getUser() {
        return user;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "user=" + user +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
