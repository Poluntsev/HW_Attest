package Attestation.CarsClass;

import Attestation.Cars.Bus;

public class SchoolBus implements Bus {
    @Override
    public void DriveOn() {
        System.out.println("Bus Drive!!");
    }

    @Override
    public void DriveOf() {
        System.out.println("Bus Stop :(");
    }

    @Override
    public void GetFuel() {
        System.out.println("Bus is get fuel");
    }
}
