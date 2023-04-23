package AbstractFactory.BusFactory;

import AbstractFactory.AbstractClass.Driver;
import AbstractFactory.BoardAnyCarFactory;
import AbstractFactory.Passenger;

import java.util.ArrayList;
import java.util.List;

public class BoardBusFactory extends BoardAnyCarFactory {
    private final int LIMIT_PASSENGERS = 30;
    private BusDriver busDiver;
    private List<Passenger> passengers = new ArrayList<>();

    @Override
    public Driver BoardDriver() {
//        if (category != Category.DCategory) {
//            return null;
//        }
        this.busDiver = BusDriver.getInstance();
        return this.busDiver;
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

