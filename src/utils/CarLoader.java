package utils;

import model.DieselCar;
import model.ElectricCar;
import model.GasolineCar;

import java.util.ArrayList;
import java.util.Collection;

public class CarLoader {

    public static Collection<GasolineCar> loadGasolineCars(String[] carsData) {
        Collection<GasolineCar> cars = new ArrayList<>();

        for (String carData : carsData) {
            cars.add(loadGasolineCar(carData));
        }

        return cars;
    }

    public static GasolineCar loadGasolineCar(String carData) {
        String[] data = carData.split(",");

        try {
            String registrationNumber = data[0].trim();
            String maker = data[1].trim();
            String model = data[2].trim();
            int numberOfDoors = Integer.parseInt(data[3].trim());
            int kmPrLitre = Integer.parseInt(data[4].trim());

            return new GasolineCar(registrationNumber, maker, model, numberOfDoors, kmPrLitre);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Collection<DieselCar> loadDieselGars(String[] carsData) {
        Collection<DieselCar> cars = new ArrayList<>();

        for (String carData : carsData) {
            cars.add(loadDieselCar(carData));
        }

        return cars;
    }

    public static DieselCar loadDieselCar(String carData) {
        String[] data = carData.split(",");

        try {
            String registrationNumber = data[0].trim();
            String maker = data[1].trim();
            String model = data[2].trim();
            int numberOfDoors = Integer.parseInt(data[3].trim());
            int kmPrLitre = Integer.parseInt(data[4].trim());
            boolean hasParticle = Boolean.parseBoolean(data[5].trim());

            return new DieselCar(registrationNumber, maker, model, numberOfDoors, kmPrLitre, hasParticle);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Collection<ElectricCar> loadElectricCars(String[] carsData) {
        Collection<ElectricCar> cars = new ArrayList<>();

        for (String carData : carsData) {
            cars.add(loadElectricCar(carData));
        }

        return cars;
    }

    public static ElectricCar loadElectricCar(String carData) {
        String[] data = carData.split(",");

        try {
            String registrationNumber = data[0].trim();
            String maker = data[1].trim();
            String model = data[2].trim();
            int numberOfDoors = Integer.parseInt(data[3].trim());
            int batteryCapacityKWh = Integer.parseInt(data[4].trim());
            int maxRangeKm = Integer.parseInt(data[5].trim());

            return new ElectricCar(registrationNumber, maker, model, numberOfDoors, batteryCapacityKWh, maxRangeKm);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
