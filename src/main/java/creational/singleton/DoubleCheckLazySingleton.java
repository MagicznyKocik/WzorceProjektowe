package creational.singleton;

public class DoubleCheckLazySingleton {

    private static volatile DoubleCheckLazySingleton INSTANCE; // volatile rezerwuje blok pamięci dla tej instancji
    private DoubleCheckLazySingleton(){}
    public static DoubleCheckLazySingleton getInstance() {
        if(INSTANCE == null){
            synchronized (DoubleCheckLazySingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLazySingleton();
                }
            }
    }
        return INSTANCE;
    }
}
