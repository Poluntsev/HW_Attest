package Attestation.CarsClass;

import Attestation.Cars.SpecialTransport;

public class Police implements SpecialTransport {
    @Override
    public void DriveOn() {
        System.out.println("Police Drive");
    }

    @Override
    public void DriveOf() {
        System.out.println("Police Stop :(");
    }

    @Override
    public void GetFuel() {
        System.out.println("Police is get fuel");
    }
}
