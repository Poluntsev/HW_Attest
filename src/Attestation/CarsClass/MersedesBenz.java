package Attestation.CarsClass;

import Attestation.Cars.PassengerCar;

public class MersedesBenz implements PassengerCar {
    @Override
    public void DriveOn() {
        System.out.println("Mers Drive!!");
    }

    @Override
    public void DriveOf() {
        System.out.println("Mers Stop :(");
    }

    @Override
    public void GetFuel() {
        System.out.println("Mers is get fuel");
    }
}
