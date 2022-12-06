package by.academy.job.task2.job.task2.order;

import by.academy.job.task2.job.task2.Transport;

import java.util.Objects;
import java.util.Scanner;

public abstract class Order {

    protected static final Scanner scanner = new Scanner(System.in);

    protected String startingPoint;
    protected String finalDestination;

    public Order(){
    }

    public Order(String startingPoint, String finalDestination) {
        this.startingPoint = startingPoint;
        this.finalDestination = finalDestination;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public abstract boolean checkOrder(Order order, Transport transport);

    public abstract void addOrder(Transport transport);

    public void unloadOrder(Transport transport){

        if (transport.getOrder().isEmpty()){
            System.out.println("Заказы отсутствуют");
        }
        else {
            for (int i = 0; i < transport.getOrder().size(); i++) {
                System.out.println("Заказ под номером: " + i + " " + transport.getOrder().get(i));
            }
            System.out.print("Введите номер заказа, который уже доставили: ");
            int numberOfOder = scanner.nextInt();

            if (numberOfOder < transport.getOrder().size()) {
                transport.getOrder().remove(numberOfOder);
            } else {
                System.out.println("Такого заказа в списке нет");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(startingPoint, order.startingPoint) && Objects.equals(finalDestination, order.finalDestination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startingPoint, finalDestination);
    }
}
