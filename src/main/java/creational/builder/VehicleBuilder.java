package creational.builder;

public interface VehicleBuilder {

    Vehicle build();
    VehicleBuilder addWheel();
    VehicleBuilder setTank(int size);


}
