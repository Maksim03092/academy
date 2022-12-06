package by.academy.job.task2.job.task2;

import by.academy.job.task2.job.task2.order.Order;
import by.academy.job.task2.job.task2.order.OrderForCargoPassengerTransport;

import java.util.ArrayList;
import java.util.Objects;

public class CargoPassengerTransport extends Transport {

    private int passengerCapacity;
    private double CargoVolume;
    private int loadCapacity;

    public CargoPassengerTransport(int yearOfRelease, String carBrand, String modelCar, String typeFuel,
                                   String fuelConsumption, int passengerCapacity,
                                   double cargoVolume, int loadCapacity, ArrayList<Order> order) {
        super(yearOfRelease, carBrand, modelCar, typeFuel, fuelConsumption, order);
        this.passengerCapacity = passengerCapacity;
        CargoVolume = cargoVolume;
        this.loadCapacity = loadCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoVolume() {
        return CargoVolume;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void checkFreeSpace() {

        int sumNumberOfPassengers = 0, sumCargoWeight = 0;
        double sumCargoVolume = 0;

        for (Order element : order) {
            sumNumberOfPassengers += ((OrderForCargoPassengerTransport)element).getNumberOfPassengers();
            sumCargoVolume += ((OrderForCargoPassengerTransport) element).getCargoVolume();
            sumCargoWeight += ((OrderForCargoPassengerTransport) element).getCargoWeight();
        }
        System.out.println("Количество свободных мест: " + (this.getPassengerCapacity() - sumNumberOfPassengers));
        System.out.println("Свободный объём: " + (this.getCargoVolume() - sumCargoVolume));
        System.out.println("Свободная грузоподъёмность: " + (this.getLoadCapacity() - sumCargoWeight));
    }

    @Override
    public String toString() {
        return "CargoPassengerTransport{" +
                "passengerCapacity=" + passengerCapacity +
                ", CargoVolume=" + CargoVolume +
                ", loadCapacity=" + loadCapacity +
                ", yearOfRelease=" + yearOfRelease +
                ", carBrand='" + carBrand + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", typeFuel='" + typeFuel + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPassengerTransport that = (CargoPassengerTransport) o;
        return passengerCapacity == that.passengerCapacity && CargoVolume == that.CargoVolume && loadCapacity == that.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity, CargoVolume, loadCapacity);
    }
}
