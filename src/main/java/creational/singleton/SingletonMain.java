package creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton == singleton2);

        EnumSingleton instance  = EnumSingleton.INSTANCE;
        instance.getValue();
    }
}
