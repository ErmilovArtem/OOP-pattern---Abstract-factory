package AbstractFactory.PizzaFactory;

import AbstractFactory.Category;
import AbstractFactory.AbstractClass.Driver;

public class CourierDriver extends Driver {
    private static CourierDriver courierDriver;

    private CourierDriver(Category category) {
        super(category);
    }

    public static synchronized CourierDriver getInstance() {
        if (courierDriver == null) {
            courierDriver = new CourierDriver(Category.BCategory);
        }
        return courierDriver;
    }

    @Override
    public Category getCategory() {
        return super.getCategory();
    }
}
