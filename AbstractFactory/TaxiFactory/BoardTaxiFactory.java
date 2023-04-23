package AbstractFactory.TaxiFactory;

import AbstractFactory.AbstractClass.Driver;
import AbstractFactory.BoardAnyCarFactory;
import AbstractFactory.Category;
import AbstractFactory.AbstractClass.APassenger;
import AbstractFactory.Passenger;

import java.util.ArrayList;
import java.util.List;

// конкретная фабрика для такси
public class BoardTaxiFactory extends BoardAnyCarFactory {
    private final int LIMIT_PASSENGERS = 4;
    private TaxiDriver taxiDriver;
    private List<Passenger> passengers = new ArrayList<>();

    @Override
    public Driver BoardDriver() {
        this.taxiDriver = TaxiDriver.getInstance();
        return this.taxiDriver;
    }

    @Override
    public void BoardPassengers(Passenger passenger) {
        if (this.passengers.size() + 1 <= LIMIT_PASSENGERS) {
            this.passengers.add(passenger);
        } else {
            System.out.println("Too many passesengers!");
        }
    }

    @Override
    public List<Passenger> getPassengers() {
        return this.passengers;
    }
}

