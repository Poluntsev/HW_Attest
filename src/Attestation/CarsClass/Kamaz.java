package Attestation.CarsClass;

import Attestation.Cars.Truck;

public class Kamaz implements Truck {
    @Override
    public void DriveOn() {
        System.out.println("Kamaz Drive");
    }

    @Override
    public void DriveOf() {
        System.out.println("Kamaz Stop :(");
    }

    @Override
    public void GetFuel() {
        System.out.println("Kamaz is get fuel");
    }
}
