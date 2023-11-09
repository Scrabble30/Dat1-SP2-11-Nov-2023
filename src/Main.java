import model.*;
import utils.CarLoader;
import utils.FileIO;

public class Main {

    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addAllCars(CarLoader.loadGasolineCars(FileIO.loadData("data/gasoline_cars.csv", 1)));
        fleetOfCars.addAllCars(CarLoader.loadDieselGars(FileIO.loadData("data/diesel_cars.csv", 1)));
        fleetOfCars.addAllCars(CarLoader.loadElectricCars(FileIO.loadData("data/electric_cars.csv", 1)));

        System.out.println(fleetOfCars);
    }
}
