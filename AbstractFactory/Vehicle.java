package AbstractFactory;

import AbstractFactory.AbstractClass.Driver;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private Driver driver;
    private List<Passenger> passengers = new ArrayList<>();

    public void viewInfo() {
        if (this.driver == null || this.passengers.size() == 0) {
            return;
        }
        System.out.println("Driver: " + this.driver.getCategory());
        System.out.println("Passengers (size = " + this.passengers.size() + "): ");
        for (Passenger passenger : this.passengers) {
            System.out.println("\t" + passenger.getNumberTicket());
        }
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setPassenger(List<Passenger> passengers) {
        this.passengers.addAll(passengers);
    }

    public List<Passenger> getPassenger() {
        return this.passengers;
    }

    public void isReadyToGo() {
        System.out.println("Ready: " + (this.driver != null && this.passengers.size() > 0));
    }
}
