package model;

import java.util.ArrayList;
import java.util.Collection;

public class FleetOfCars {

    private final ArrayList<Car> fleet;

    public FleetOfCars() {
        this.fleet = new ArrayList<>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public <E extends Car> void addAllCars(Collection<E> cars) {
        fleet.addAll(cars);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;

        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }

        return totalFee;
    }

    @Override
    public String toString() {
        return String.format("Cars: %d\n%s\nTotal Registration Fee: %d", fleet.size(), String.join("\n", fleet.stream().map(Car::toString).toArray(String[]::new)), getTotalRegistrationFeeForFleet());
    }
}
