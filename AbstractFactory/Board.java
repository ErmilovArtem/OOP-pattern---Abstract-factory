package AbstractFactory;

import AbstractFactory.TaxiFactory.BoardTaxiFactory;

public class Board {
    public static Vehicle boardCar(BoardAnyCarFactory factory, int[] tickets) {
        Vehicle vehicle = new Vehicle();
//        if (factory.getClass() == BoardTaxiFactory.class) {
//            vehicle.setDriver(factory.BoardDriver(Category.BCategory));
//        } else {
//            vehicle.setDriver(factory.BoardDriver(Category.DCategory));
//        }
        vehicle.setDriver(factory.BoardDriver());
        for (int ticket : tickets) {
            factory.BoardPassengers(new Passenger(ticket));
        }
        vehicle.setPassenger(factory.getPassengers());
        return vehicle;
    }
}
