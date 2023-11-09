package model;

public class ElectricCar extends ACar {

    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String maker, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, maker, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getWhPrKm() {
        return getBatteryCapacityKWh() * 1000 / getMaxRangeKm();
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLiter = (int) (100 / (getWhPrKm() / 91.25));

        if (kmPrLiter < 5) {
            return 10470;
        } else if (kmPrLiter < 10) {
            return 5500;
        } else if (kmPrLiter < 15) {
            return 2340;
        } else if (kmPrLiter < 20) {
            return 1050;
        } else {
            return 330;
        }
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    @Override
    public String toString() {
        return String.format("%s, Capacity: %s kWh, Range: %s km, WhPrKm: %-3s Wh/km, RegistrationFee: %s", super.toString(), getBatteryCapacityKWh(), getMaxRangeKm(), getWhPrKm(), getRegistrationFee());
    }
}
