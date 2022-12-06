package by.academy.job.task2.job.task2.order;

import by.academy.job.task2.job.task2.CargoPassengerTransport;
import by.academy.job.task2.job.task2.Transport;

import java.util.Objects;

public class OrderForCargoPassengerTransport extends Order {

    private int cargoVolume;
    private int cargoWeight;
    private int numberOfPassengers;

    public OrderForCargoPassengerTransport(){

    }

    public OrderForCargoPassengerTransport(String startingPoint, String finalDestination, int cargoVolume,
                                           int cargoWeight, int numberOfPassengers) {
        super(startingPoint, finalDestination);
        this.cargoVolume = cargoVolume;
        this.cargoWeight = cargoWeight;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public boolean checkOrder(Order order, Transport transport) {

        if (transport.getOrder().isEmpty()){
            return ((OrderForCargoPassengerTransport)order).numberOfPassengers <=
                            ((CargoPassengerTransport)transport).getPassengerCapacity() &&
                    ((OrderForCargoPassengerTransport)order).cargoVolume <=
                            ((CargoPassengerTransport)transport).getCargoVolume() &&
                    ((OrderForCargoPassengerTransport)order).cargoWeight <=
                            ((CargoPassengerTransport)transport).getLoadCapacity();
        }
        else {
            int sumNumberOfPassengers = 0, sumCargoWeight = 0;
            double sumCargoVolume = 0;

            for (Order element : transport.getOrder()) {
                sumNumberOfPassengers += ((OrderForCargoPassengerTransport) element).numberOfPassengers;
                sumCargoVolume += ((OrderForCargoPassengerTransport) element).cargoVolume;
                sumCargoWeight += ((OrderForCargoPassengerTransport) element).cargoWeight;
            }
            return sumNumberOfPassengers + ((OrderForCargoPassengerTransport) order).numberOfPassengers <=
                    ((CargoPassengerTransport) transport).getPassengerCapacity() &&
                    sumCargoVolume + ((OrderForCargoPassengerTransport) order).cargoVolume <=
                            ((CargoPassengerTransport) transport).getCargoVolume() &&
                    sumCargoWeight + ((OrderForCargoPassengerTransport) order).cargoWeight <=
                            ((CargoPassengerTransport) transport).getLoadCapacity();
        }
    }

    @Override
    public void addOrder(Transport transport) {

        System.out.print("Введите начальный пункт: ");
        String startingPoint = scanner.next();
        System.out.print("Введите конечный пункт: ");
        String finalDestination = scanner.next();
        System.out.print("Введите количество человек: ");
        int numberOfPerson = scanner.nextInt();
        System.out.print("Введите объём груза: ");
        int cargoVolume = scanner.nextInt();
        System.out.print("Введите вес груза: ");
        int cargoWeight = scanner.nextInt();
        OrderForCargoPassengerTransport order = new OrderForCargoPassengerTransport(startingPoint,
                finalDestination, cargoVolume, cargoWeight, numberOfPerson);

        if (order.checkOrder(order, transport)){
            transport.getOrder().add(order);
        }
        else {
            System.out.println("Данный вид транспорта не сможет перевести такое количество груза");
        }
    }

    @Override
    public String toString() {
        return "Грузопассажирский транспорт{" +
                "Начальный пункт='" + startingPoint + '\'' +
                ", Конечный пункт='" + finalDestination + '\'' +
                ", Объём груза=" + cargoVolume +
                ", Вес груза=" + cargoWeight +
                ", Количество пассажиров=" + numberOfPassengers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderForCargoPassengerTransport order = (OrderForCargoPassengerTransport) o;
        return cargoVolume == order.cargoVolume && cargoWeight == order.cargoWeight && numberOfPassengers == order.numberOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoVolume, cargoWeight, numberOfPassengers);
    }
}



