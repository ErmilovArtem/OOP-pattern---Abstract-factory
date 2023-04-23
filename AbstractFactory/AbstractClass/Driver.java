package AbstractFactory.AbstractClass;


import AbstractFactory.Category;

public abstract class Driver {
    private static Driver driver;
    private Category category;

    protected Driver(Category category) {
        this.category = category;
    }

    public static synchronized Driver getInstance(Category category) {
        if (driver == null) {
            driver = createDriver(category);
        }
        return driver;
    }

    protected static Driver createDriver(Category category) {
        return new Driver(category) {
        };
    }

    public Category getCategory() {
        return category;
    }
}

