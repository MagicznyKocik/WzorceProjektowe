package create.prototype;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeComputerBuilder builder = new PrototypeComputerBuilder();

        Computer computer1 = builder.build();
        Computer computer2 = builder.build(); // szybkie stworzenie zmiennej ctrl+alt+v
        System.out.println(computer1 == computer2);
        PrototypeComputerBuilder builder2 = new PrototypeComputerBuilder();
        Computer computer3 = builder2.build(); // drugi raz się nie wywoła statycne tworzenie prototypu
    }

}
