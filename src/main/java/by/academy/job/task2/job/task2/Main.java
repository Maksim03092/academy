package by.academy.job.task2.job.task2;

import by.academy.job.task2.job.task2.order.Order;
import by.academy.job.task2.job.task2.order.OrderForCargoPassengerTransport;
import by.academy.job.task2.job.task2.order.OrderForTruck;
import by.academy.job.task2.job.task2.order.OrderPassengerTransport;
import by.academy.job.task2.job.task2.truck.RefrigeratorTruck;
import by.academy.job.task2.job.task2.truck.TankTruck;
import by.academy.job.task2.job.task2.truck.TiltTruck;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CargoPassengerTransport cargoPassengerTransport = new CargoPassengerTransport(2021, "FORD",
                "Transit 2.0 TDCI 130 pk L3H2", "Дизель", "7л",
                7, 3.6645596, 869, new ArrayList<>());

        PassengerTransport passengerTransport = new PassengerTransport(2014,"VDL",
                "Citea LLE 40 Seats EURO 6 ", "Дизель", "26л", 39,
                new ArrayList<>());

        TiltTruck tiltTruck = new TiltTruck(2015, "VOLVO", "FM 450", "Дизель",
                "30л", 37.3248, 11470, "Тентованный", new ArrayList<>());

        RefrigeratorTruck refrigeratorTruck = new RefrigeratorTruck(2005, "IVECO",
                "Stralis 270", "Дизель", "27л", 30.864834, 8680,
                "Рефрижераторный", new ArrayList<>());

        TankTruck tankTruck = new TankTruck(2011, "SCANIA", "G 400", "Дизель",
                "25л", 15500, 10730, "Цистерны", new ArrayList<>());

        while (true){

            boolean check;
            String choiceOfOperation, nameTransport, productType;

            System.out.print("Введите 1, если вы хотите добавить заказ\n" +
                    "Введите 2, если вы хотите посмотреть свободную грузоподъёмномть, объём (либо колличество мест) " +
                    "и заказы, которые на данный момент загружены в машину\n" +
                    "Введите 3, если хотите разгузить машину: ");

            choiceOfOperation = scanner.next();

            switch (choiceOfOperation) {

                case "1":

                System.out.print("(Пассажирский, Грузопассажирский, Грузовой)\n" +
                        "Введите название транспорта, который необходимо заказать: ");
                nameTransport = scanner.next();

                switch (nameTransport) {

                    case "Пассажирский":

                        new OrderPassengerTransport().addOrder(passengerTransport);

                        break;

                    case "Грузопассажирский":

                        new OrderForCargoPassengerTransport().addOrder(cargoPassengerTransport);

                        break;

                    case "Грузовой":
                        System.out.print("Введите тип груза, который необходимо перевезти(Промтовары, " +
                                "Скоропортящиеся, Жидкость): ");
                        productType = scanner.next();

                        switch (productType) {

                            case "Промтовары":

                                new OrderForTruck().addOrder(tiltTruck);

                                break;

                            case "Скоропортящиеся":

                                new OrderForTruck().addOrder(refrigeratorTruck);

                                break;

                            case "Жидкость":

                                new OrderForTruck().addOrder(tankTruck);

                                break;

                            default:
                                System.out.println("Я не знаю такого типа продукта");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Я не знаю такого транспорта");
                        break;
                }
                break;

                case "2":
                    System.out.print("(Пассажирский, Грузопассажирский, Грузовой)\n" +
                            "Введите название транспорта: ");
                    nameTransport = scanner.next();

                    switch (nameTransport) {

                        case "Пассажирский":

                            for(Order element : passengerTransport.getOrder()){
                                System.out.println(element);
                            }
                            passengerTransport.checkFreeSpace();
                            break;

                        case "Грузопассажирский":

                            for (Order element : cargoPassengerTransport.getOrder()){
                                System.out.println(element);
                            }
                            cargoPassengerTransport.checkFreeSpace();
                            break;

                        case "Грузовой":
                            System.out.print("Введите тип груза, который перевозит грузовик(Промтовары, " +
                                    "Скоропортящиеся, Жидкость): ");
                            productType = scanner.next();

                            switch (productType) {
                                case "Промтовары":
                                    for (Order element : tiltTruck.getOrder()) {
                                        System.out.println(element);
                                    }
                                    tiltTruck.checkFreeSpace();
                                    break;

                                case "Скоропортящиеся":
                                    for (Order element : refrigeratorTruck.getOrder()) {
                                        System.out.println(element);
                                    }
                                    refrigeratorTruck.checkFreeSpace();
                                    break;

                                case "Жидкость":
                                    for (Order element : tankTruck.getOrder()) {
                                        System.out.println(element);
                                    }
                                    tankTruck.checkFreeSpace();
                                    break;

                                default:
                                    System.out.println("Я не знаю такого типа продукта");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Я не знаю такого транспорта");
                            break;
                    }
                    break;

                case "3":
                    System.out.print("(Пассажирский, Грузопассажирский, Грузовой)\n" +
                            "Введите название транспорта, который необходимо разгрузить: ");
                    nameTransport = scanner.next();

                    switch (nameTransport){

                        case "Пассажирский":

                            new OrderPassengerTransport().unloadOrder(passengerTransport);

                            break;

                        case "Грузопассажирский":

                            new OrderForCargoPassengerTransport().unloadOrder(cargoPassengerTransport);

                            break;

                        case "Грузовой":
                            System.out.print("Введите тип груза, который перевозил грузовик (Промтовары, " +
                                    "Скоропортящиеся, Жидкость): ");
                            productType = scanner.next();

                            switch (productType) {
                                case "Промтовары":

                                    new OrderForTruck().unloadOrder(tiltTruck);

                                    break;

                                case "Скоропортящиеся":

                                    new OrderForTruck().unloadOrder(refrigeratorTruck);

                                    break;

                                case "Жидкость":

                                    new OrderForTruck().unloadOrder(tankTruck);

                                    break;

                                default:
                                    System.out.println("Я не знаю такого типа продукта");
                                    break;
                            }

                            break;

                        default:
                            System.out.println("Я не знаю такого транспорта");
                            break;
                    }
                    break;

                default:
                    System.out.println("Я не знаю такой команды");
                    break;
            }

            while (true) {

                System.out.print("Хотите продолжить? Введите либо Да, либо Нет: ");
                String out = scanner.next();

                if (out.equals("Да")) {
                    check = false;
                    break;
                }
                else if (out.equals("Нет")){
                    check = true;
                    break;
                }
                else {
                    System.out.println("Я не знаю такой команды");
                }
            }
            if (check){
                break;
            }
        }
    }
}
