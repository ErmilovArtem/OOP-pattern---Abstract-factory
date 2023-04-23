package AbstractFactory.TaxiFactory;

import AbstractFactory.Category;
import AbstractFactory.AbstractClass.Driver;

public class TaxiDriver extends Driver {
    private static TaxiDriver taxiDriver;

    private TaxiDriver(Category category) {
        super(category);
    }

    public static synchronized TaxiDriver getInstance() {
        if (taxiDriver == null) {
            taxiDriver = new TaxiDriver(Category.BCategory);
        }
        return taxiDriver;
    }

    @Override
    public Category getCategory() {
        return super.getCategory();
    }
}
