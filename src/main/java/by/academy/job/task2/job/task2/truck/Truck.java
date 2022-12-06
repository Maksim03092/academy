package by.academy.job.task2.job.task2.truck;

import by.academy.job.task2.job.task2.Transport;
import by.academy.job.task2.job.task2.order.Order;
import by.academy.job.task2.job.task2.order.OrderForTruck;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Truck extends Transport {

    protected double CargoVolume;
    protected int loadCapacity;
    protected String bodyType;

    public Truck(int yearOfRelease, String carBrand, String modelCar, String typeFuel, String fuelConsumption,
                  double cargoVolume, int loadCapacity, String bodyType, ArrayList<Order> order) {
        super(yearOfRelease, carBrand, modelCar, typeFuel, fuelConsumption, order);
        CargoVolume = cargoVolume;
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    public double getCargoVolume() {
        return CargoVolume;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public void checkFreeSpace() {
        int sumCargoWeight = 0;
        double sumCargoVolume = 0;

        for (Order element : order) {
            sumCargoVolume += ((OrderForTruck) element).getCargoVolume();
            sumCargoWeight += ((OrderForTruck) element).getCargoWeight();
        }
        System.out.println("Свободный объём: " + (this.getCargoVolume() - sumCargoVolume));
        System.out.println("Свободная грузоподъёмность: " + (this.getLoadCapacity() - sumCargoWeight));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return CargoVolume == truck.CargoVolume && loadCapacity == truck.loadCapacity && Objects.equals(bodyType, truck.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), CargoVolume, loadCapacity, bodyType);
    }
}
