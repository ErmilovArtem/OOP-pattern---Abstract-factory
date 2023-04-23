package AbstractFactory;

import AbstractFactory.AbstractClass.APassenger;
import AbstractFactory.AbstractClass.Driver;

import java.util.List;

public abstract class BoardAnyCarFactory {
    public abstract Driver BoardDriver();
    public abstract void BoardPassengers(Passenger passenger);
    public abstract List<Passenger> getPassengers();
}