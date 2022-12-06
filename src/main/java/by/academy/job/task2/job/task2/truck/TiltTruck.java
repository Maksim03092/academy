package by.academy.job.task2.job.task2.truck;

import by.academy.job.task2.job.task2.order.Order;

import java.util.ArrayList;

public class TiltTruck extends Truck {

    public TiltTruck(int yearOfRelease, String carBrand, String modelCar, String typeFuel, String fuelConsumption,
                     double cargoVolume, int loadCapacity, String bodyType, ArrayList<Order> order) {
        super(yearOfRelease, carBrand, modelCar, typeFuel, fuelConsumption, cargoVolume, loadCapacity, bodyType, order);
    }

    @Override
    public String toString() {
        return "TiltTruck{" +
                "yearOfRelease=" + yearOfRelease +
                ", carBrand='" + carBrand + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", typeFuel='" + typeFuel + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", order=" + order +
                ", CargoVolume=" + CargoVolume +
                ", loadCapacity=" + loadCapacity +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
