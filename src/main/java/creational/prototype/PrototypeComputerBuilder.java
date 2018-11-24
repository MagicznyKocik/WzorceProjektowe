package creational.prototype;

public class PrototypeComputerBuilder {

    private static final Computer PROTOTYPE = createPrototype();

    private static Computer createPrototype() {
        System.out.println("Tworzenie komputera");
        return new Computer("Intel", 1024, 20000);
    }

    public Computer build() throws CloneNotSupportedException {
        return (Computer) PROTOTYPE.clone();

    };
}
