package Attestation.CarsClass;

import Attestation.Cars.PassengerCar;

import javax.xml.xpath.XPathFunctionException;

public class MercedesBenz implements PassengerCar {
    double fuelConsumption = 8.5; // Расход на 100км
    double fuelInTank; // Остаток топлива

    @Override
    public void DriveOn(double distance, double fuelInTank) {

        double fuel = fuelInTank;

        System.out.println("Mers drive distance: " + distance);

        while (fuel>0) {
            System.out.println("Fuel in tank: " + fuel);
            fuel = fuel - distance/100 *fuelConsumption;
        }
    }

    @Override
    public void DriveOf() {

    }

    @Override
    public void getFuel(int fuelV) {

        System.out.println("Mers is get fuel");

        fuelInTank = fuelInTank + fuelV;
    }
}
