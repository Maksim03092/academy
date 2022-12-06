package by.academy.job.task2.job.task2;

import by.academy.job.task2.job.task2.order.Order;
import by.academy.job.task2.job.task2.order.OrderPassengerTransport;

import java.util.ArrayList;
import java.util.Objects;

public class PassengerTransport extends Transport {

    private int passengerCapacity;

    public PassengerTransport(int yearOfRelease, String carBrand, String modelCar, String typeFuel,
                              String fuelConsumption,int passengerCapacity, ArrayList<Order> order) {
        super(yearOfRelease, carBrand, modelCar, typeFuel, fuelConsumption, order);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void disinfectSalon(){
        System.out.println("Салон продезинфицирован");
    }

    @Override
    public void checkFreeSpace() {

        int sumNumberOfPassengers = 0;

        for (Order element : order) {
            sumNumberOfPassengers += ((OrderPassengerTransport)element).getNumberOfPassengers();
        }
        System.out.println("Количество свободных мест: " + (this.getPassengerCapacity() - sumNumberOfPassengers));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerTransport that = (PassengerTransport) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "passengerCapacity=" + passengerCapacity +
                ", yearOfRelease=" + yearOfRelease +
                ", carBrand='" + carBrand + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", typeFuel='" + typeFuel + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", order=" + order +
                '}';
    }
}
