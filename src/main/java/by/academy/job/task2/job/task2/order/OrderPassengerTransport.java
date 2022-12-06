package by.academy.job.task2.job.task2.order;

import by.academy.job.task2.job.task2.PassengerTransport;
import by.academy.job.task2.job.task2.Transport;

import java.util.Objects;

public class OrderPassengerTransport extends Order {

    private int numberOfPassengers;

    public OrderPassengerTransport(String startingPoint, String finalDestination, int numberOfPassengers) {
        super(startingPoint, finalDestination);
        this.numberOfPassengers = numberOfPassengers;
    }

    public OrderPassengerTransport(){

    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public boolean checkOrder(Order order, Transport transport) {

        if(transport.getOrder().isEmpty()){
            return  ((OrderPassengerTransport)order).numberOfPassengers <=
                    ((PassengerTransport)transport).getPassengerCapacity();
        }
        else {
            int sumNumberOfPassengers = 0;

            for (Order element : transport.getOrder()) {
                sumNumberOfPassengers += ((OrderPassengerTransport) element).numberOfPassengers;
            }
            return sumNumberOfPassengers + ((OrderPassengerTransport) order).numberOfPassengers <=
                    ((PassengerTransport) transport).getPassengerCapacity();
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
        OrderPassengerTransport orderPassengerTransport = new OrderPassengerTransport(startingPoint,
                finalDestination, numberOfPerson);

        if (checkOrder(orderPassengerTransport, transport)) {
            transport.getOrder().add(orderPassengerTransport);
        }
        else {
            System.out.println("Данный вид транспорта не сможет вместить такое количество человек");
        }
    }

    @Override
    public String toString() {
        return "Пассажирский транспорт{" +
                "Начальный пункт='" + startingPoint + '\'' +
                ", Конечный пункт='" + finalDestination + '\'' +
                ", Количество пассажиров=" + numberOfPassengers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrderPassengerTransport that = (OrderPassengerTransport) o;
        return numberOfPassengers == that.numberOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPassengers);
    }
}
