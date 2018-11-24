package create.builder;

public interface VehicleBuilder {

    Vehicle build();
    void addWheel();
    void setTank(int size);


}
