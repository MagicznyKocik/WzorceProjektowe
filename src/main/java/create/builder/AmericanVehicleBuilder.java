package create.builder;

import java.util.ArrayList;
import java.util.List;

public class AmericanVehicleBuilder implements VehicleBuilder {

    private int size;
    private List<Wheel> wheelList =  new ArrayList<>();



    @Override
    public Vehicle build() {
        return new Vehicle(size, new ArrayList<>(wheelList));
    }

    @Override
    public void addWheel() {
        wheelList.add(new Wheel(23));

    }

    @Override
    public void setTank(int size) {
        this.size = size * 2;
    }
}
