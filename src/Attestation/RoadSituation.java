package Attestation;

import Attestation.Cars.*;
import Attestation.CarsClass.CarsClassFactory;

public class RoadSituation {
    public static void main(String[] args) {

        CarFactory carFactory = new CarsClassFactory();

        Bus bus = carFactory.getBus();
        CargoPassengerCar cargoPassengerCar = carFactory.getCPCar();
        PassengerCar passengerCar = carFactory.getPCar();
        SpecialTransport specialTransport = carFactory.getSTransport();
        Truck truck = carFactory.getTruck();

        System.out.println("Modeling the situation...");

        bus.DriveOn();
        cargoPassengerCar.DriveOn();
        passengerCar.DriveOn(100, 1500);
        specialTransport.DriveOn();
        truck.DriveOn();

        System.out.println("All cars in motion");



    }
}

