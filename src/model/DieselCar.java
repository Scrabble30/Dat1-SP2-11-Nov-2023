package model;

public class DieselCar extends AFuelCar {

    private final boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String maker, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, maker, model, numberOfDoors, kmPrLitre);

        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public int getRegistrationFee() {
        //int registrationFee = !hasParticleFilter() ? 1000 : 0;

        int registrationFee = 0;

        if (!hasParticleFilter()) {
            registrationFee += 1000;
        }

        if (getKmPrLitre() < 5) {
            registrationFee += 10470 + 15260;
        } else if (getKmPrLitre() < 10) {
            registrationFee += 5500 + 2770;
        } else if (getKmPrLitre() < 15) {
            registrationFee += 2340 + 1850;
        } else if (getKmPrLitre() < 20) {
            registrationFee += 1050 + 1390;
        } else {
            registrationFee += 330 + 130;
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

        return registrationFee;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public String toString() {
        return String.format("%s, HasFilter: %-5s, RegistrationFee: %s", super.toString(), hasParticleFilter(), getRegistrationFee());
    }
}
