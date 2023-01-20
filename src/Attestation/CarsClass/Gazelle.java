package Attestation.CarsClass;

import Attestation.Cars.CargoPassengerCar;

public class Gazelle implements CargoPassengerCar {
    @Override
    public void DriveOn() {
        System.out.println("Gazelle Drive!!");
    }

    @Override
    public void DriveOf() {
        System.out.println("Gazelle Stop :(");
    }

    @Override
    public void GetFuel() {
        System.out.println("Gazelle is get fuel");
    }
}
