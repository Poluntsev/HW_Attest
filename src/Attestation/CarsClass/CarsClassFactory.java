package Attestation.CarsClass;

import Attestation.Cars.*;

public class CarsClassFactory implements CarFactory {
    @Override
    public Bus getBus() {
        return new SchoolBus();
    }

    @Override
    public CargoPassengerCar getCPCar() {
        return new Gazelle();
    }

    @Override
    public PassengerCar getPCar() {
        return new MersedesBenz();
    }

    @Override
    public SpecialTransport getSTransport() {
        return new Police();
    }

    @Override
    public Truck getTruck() {
        return new Kamaz();
    }
}
