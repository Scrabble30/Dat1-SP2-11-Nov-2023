package model;

public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String maker, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, maker, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public int getRegistrationFee() {
        if (getKmPrLitre() < 5) {
            return 10470;
        } else if (getKmPrLitre() < 10) {
            return 5500;
        } else if (getKmPrLitre() < 15) {
            return 2340;
        } else if (getKmPrLitre() < 20) {
            return 1050;
        } else {
            return 330;
        }

        /*if (getKmPrLitre() < 5) {
            return 10470;
        } else if (getKmPrLitre() >= 5 && getKmPrLitre() <= 10) {
            return 5500;
        } else if (getKmPrLitre() >= 10 && getKmPrLitre() <= 15) {
            return 2340;
        } else if (getKmPrLitre() >= 15 && getKmPrLitre() <= 20) {
            return 1050;
        } else {
            return 330;
        }*/
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString() {
        return String.format("%s, RegistrationFee: %s", super.toString(), getRegistrationFee());
    }
}
