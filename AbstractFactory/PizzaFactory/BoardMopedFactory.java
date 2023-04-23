package AbstractFactory.PizzaFactory;

import AbstractFactory.AbstractClass.Driver;
import AbstractFactory.BoardAnyCarFactory;
import AbstractFactory.Passenger;

import java.util.ArrayList;
import java.util.List;

// конкретная фабрика для такси
public class BoardMopedFactory extends BoardAnyCarFactory {
    private final int LIMIT_PIZZA= 10;
    private CourierDriver courierDriver;
    private List<Passenger> pizza = new ArrayList<>();

    @Override
    public Driver BoardDriver() {
        this.courierDriver = CourierDriver.getInstance();
        return this.courierDriver;
    }

    @Override
    public void BoardPassengers(Passenger passenger) {
        if (this.pizza.size() + 1 <= LIMIT_PIZZA) {
            this.pizza.add(passenger);
        } else {
            System.out.println("Too many pizza!");
        }
    }

    @Override
    public List<Passenger> getPassengers() {
        return this.pizza;
    }
}

