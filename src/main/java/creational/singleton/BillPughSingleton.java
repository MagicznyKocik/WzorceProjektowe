package creational.singleton;

public class BillPughSingleton {
    private final String value;

    private BillPughSingleton() {
        this.value = "jakas wartosc";
    }

    private static class Singleton{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Singleton.INSTANCE;
    }

}
