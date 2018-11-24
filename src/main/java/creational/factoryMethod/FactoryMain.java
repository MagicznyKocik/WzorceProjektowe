package creational.factoryMethod;

public class FactoryMain {

    public static void main(String[] args) {
        ZooFactory factory = new ZooFactoryBasedOnName("Reksio");
        Animal animal = factory.createAnimal();
        animal.makeSound();
        factory = new ZooFactoryBasedOnName("Menda");
        Animal anima2 = factory.createAnimal();
        anima2.makeSound();
    }

}
