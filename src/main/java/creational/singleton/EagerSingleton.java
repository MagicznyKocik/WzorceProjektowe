package creational.singleton;

class EagerSingleton {
    private final static EagerSingleton INSTANCE = new EagerSingleton();
    private String vlue;

    private EagerSingleton() {
        this.vlue = "smth";
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public String getVlue() {
        return vlue;
    }

    @Override
    public String toString() {
        return "EagerSingleton{" +
                "vlue='" + vlue + '\'' +
                '}';
    }
}
