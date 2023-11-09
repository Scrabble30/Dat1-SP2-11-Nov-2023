package model;

public abstract class ACar implements Car {

    private String registrationNumber;
    private final String maker;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String maker, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.maker = maker;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMaker() {
        return maker;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public abstract int getRegistrationFee();

    @Override
    public String toString() {
        return String.format("%-8s - %-16s, RegistrationNumber: %s, Doors: %d", maker, model, registrationNumber, numberOfDoors);
    }
}
