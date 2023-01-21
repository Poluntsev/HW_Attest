package Attestation.Generator;


import Attestation.Cars.*;
import Attestation.CarsClass.CarsClassFactory;

public class FirstSituation implements ISituationGenerator {
    @Override
    public void generate() {

        System.out.println("Generate first situation...");

        CarFactory carFactory = new CarsClassFactory();

        Bus bus = carFactory.getBus();
        CargoPassengerCar cargoPassengerCar = carFactory.getCPCar();
        PassengerCar passengerCar = carFactory.getPCar();
        SpecialTransport specialTransport = carFactory.getSTransport();
        Truck truck = carFactory.getTruck();

        System.out.println("Modeling the situation...");

        bus.DriveOn();
        cargoPassengerCar.DriveOn();
        specialTransport.DriveOn();
        truck.DriveOn();
        passengerCar.DriveOn(100, 1500);

        System.out.println("All cars in motion");
    }
}
