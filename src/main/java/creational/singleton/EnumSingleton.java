package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    private String value;
    EnumSingleton(){
        value = "jakas wartosc";
    }

    public String getValue() {
        return value;
    }
}
