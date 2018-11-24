package creational.factoryMethod;

public class ZooFactoryBasedOnName implements ZooFactory {

    private final String name;
    public ZooFactoryBasedOnName(String name){
        this.name = name;
    }

    @Override
    public Animal createAnimal() {
        if (name.endsWith("a")){
            return new Cat();
        } else {
            return new Dog();
        }
    }
}
