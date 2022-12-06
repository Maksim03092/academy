package by.academy.job.task2.job.task2;

import by.academy.job.task2.job.task2.order.Order;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport {

    protected int yearOfRelease;
    protected String carBrand;
    protected String modelCar;
    protected String typeFuel;
    protected String fuelConsumption;
    protected ArrayList<Order> order;

    public Transport(int yearOfRelease, String carBrand, String modelCar, String typeFuel,
                     String fuelConsumption, ArrayList<Order> order) {
        this.yearOfRelease = yearOfRelease;
        this.carBrand = carBrand;
        this.modelCar = modelCar;
        this.typeFuel = typeFuel;
        this.fuelConsumption = fuelConsumption;
        this.order = order;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModelCar() {
        return modelCar;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public abstract void checkFreeSpace();

    public void repairCar(){
        System.out.println("Машина отремонтирована");
    }

    public void fillUpCar(){
        System.out.println("Машина заправлена");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return yearOfRelease == transport.yearOfRelease && Objects.equals(carBrand, transport.carBrand) &&
                Objects.equals(modelCar, transport.modelCar) &&
                Objects.equals(typeFuel, transport.typeFuel) &&
                Objects.equals(fuelConsumption, transport.fuelConsumption) &&
                Objects.equals(order, transport.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfRelease, carBrand, modelCar, typeFuel, fuelConsumption, order);
    }

}
