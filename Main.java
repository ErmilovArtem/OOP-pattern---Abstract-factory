import AbstractFactory.Board;
import AbstractFactory.BusFactory.BoardBusFactory;
import AbstractFactory.PizzaFactory.BoardMopedFactory;
import AbstractFactory.TaxiFactory.BoardTaxiFactory;
import AbstractFactory.Vehicle;

public class Main {
    public static void main(String[] args) {
        int[] taxiTickets = {0, 1, 2, 3};
        int[] busTickets = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] taxiTicketsFull = {0, 1, 2, 3, 4};
        int[] busTicketsFull = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};


        BoardTaxiFactory taxiFactory = new BoardTaxiFactory();
        BoardBusFactory busFactory = new BoardBusFactory();

        Vehicle taxi = Board.boardCar(taxiFactory, taxiTickets);
        Vehicle bus = Board.boardCar(busFactory, busTickets);

        taxi.viewInfo();
        taxi.isReadyToGo();
        bus.viewInfo();
        bus.isReadyToGo();
        Vehicle taxi2 = Board.boardCar(taxiFactory, taxiTicketsFull);
        Vehicle bus2 = Board.boardCar(busFactory, busTicketsFull);
        taxi2.viewInfo();
       taxi2.isReadyToGo();
        bus2.viewInfo();
        bus2.isReadyToGo();


        int[] pizza = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        BoardMopedFactory mopedFactory = new BoardMopedFactory();
        Vehicle moped = Board.boardCar(mopedFactory, pizza);

        moped.viewInfo();
        moped.isReadyToGo();
    }
}