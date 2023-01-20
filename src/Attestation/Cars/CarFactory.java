package Attestation.Cars;

public interface CarFactory {
    Bus getBus();
    CargoPassengerCar getCPCar();
    PassengerCar getPCar();
    SpecialTransport getSTransport();
    Truck getTruck();
}
