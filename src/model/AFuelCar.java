package model;

public abstract class AFuelCar extends ACar {

    private final int kmPrLitre;

    public AFuelCar(String registrationNumber, String maker, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, maker, model, numberOfDoors);

        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre() {
        return this.kmPrLitre;
    }

    @Override
    public String toString() {
        return String.format("%s, km/l: %-2s, FuelType: %s", super.toString(), getKmPrLitre(), getFuelType());
    }
}
