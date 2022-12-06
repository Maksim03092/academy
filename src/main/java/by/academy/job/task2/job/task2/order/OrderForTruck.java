package by.academy.job.task2.job.task2.order;

import by.academy.job.task2.job.task2.Transport;
import by.academy.job.task2.job.task2.truck.Truck;

import java.util.Objects;

public class OrderForTruck extends Order {

    private int cargoVolume;
    private int cargoWeight;

    public OrderForTruck(){

    }

    public OrderForTruck(String startingPoint, String finalDestination, int cargoVolume, int cargoWeight) {
        super(startingPoint, finalDestination);
        this.cargoVolume = cargoVolume;
        this.cargoWeight = cargoWeight;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void sealBody(){
        System.out.println("Кузов опломбирован");
    }

    @Override
    public boolean checkOrder(Order order, Transport transport) {

        if (transport.getOrder().isEmpty()){
            return ((OrderForTruck) order).cargoVolume <=
                            ((Truck) transport).getCargoVolume() &&
                    ((OrderForTruck) order).cargoWeight <=
                            ((Truck) transport).getLoadCapacity();
        }
        else {
            int sumCargoWeight = 0;
            double sumCargoVolume = 0;

            for (Order element : transport.getOrder()) {
                sumCargoVolume += ((OrderForTruck) element).cargoVolume;
                sumCargoWeight += ((OrderForTruck) element).cargoWeight;
            }
            return sumCargoVolume + ((OrderForTruck) order).cargoVolume <=
                    ((Truck) transport).getCargoVolume() &&
                    sumCargoWeight + ((OrderForTruck) order).cargoWeight <=
                            ((Truck) transport).getLoadCapacity();
        }
    }

    @Override
    public void addOrder(Transport transport) {

        System.out.print("Введите начальный пункт: ");
        startingPoint = scanner.next();
        System.out.print("Введите конечный пункт: ");
        finalDestination = scanner.next();
        System.out.print("Введите объём груза: ");
        cargoVolume = scanner.nextInt();
        System.out.print("Введите вес груза: ");
        cargoWeight = scanner.nextInt();
        OrderForTruck orderForTruck = new OrderForTruck(startingPoint, finalDestination,
                cargoVolume, cargoWeight);

        if (orderForTruck.checkOrder (orderForTruck, transport)) {
            transport.getOrder().add(orderForTruck);
        }
        else {
            System.out.println("Данный вид транспорта не сможет перевести такое количество груза");
        }
    }

    @Override
    public String toString() {
        return "Грузовой трансопорт{" +
                "Начальный пункт='" + startingPoint + '\'' +
                ", Конечный пункт='" + finalDestination + '\'' +
                ", Объём груза=" + cargoVolume +
                ", Вес груза=" + cargoWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderForTruck that = (OrderForTruck) o;
        return cargoVolume == that.cargoVolume && cargoWeight == that.cargoWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoVolume, cargoWeight);
    }
}
