package create.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AmericanVehicleBuilder implements VehicleBuilder {

    private int size;
    private List<Wheel> wheelList =  new ArrayList<>();



    @Override
    public Vehicle build() {
        ArrayList<Wheel> list  = new ArrayList<Wheel>(wheelList);
        List<Wheel> wheel  = Collections.unmodifiableList(list);
        return new Vehicle(size, wheel);
    }

    @Override
    public VehicleBuilder addWheel() {
        wheelList.add(new Wheel(23));
        return this;

    }

    @Override
    public VehicleBuilder setTank(int size) {
        this.size = size * 2;
        return this;
    }
}
