package by.academy.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        boolean check = true;
        boolean check1 = true;
        Product[] products = null;

        User seller = new User("Max",1000);
        User buyer = new User("Nick", 1000);

        Date date = new Date();

        while (true) {
            System.out.print("Введите свою дату рождения: ");
            String date1 = scanner.next();
            if (date.checkDate1(date1)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date date2 = simpleDateFormat.parse(date1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                System.out.println("День: " + calendar.get(Calendar.DAY_OF_MONTH));
                System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
                System.out.println("Год: " + calendar.get(Calendar.YEAR));
                break;
            }
            else if (date.checkDate2(date1)){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date date2 = simpleDateFormat.parse(date1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                System.out.println("День: " + calendar.get(Calendar.DAY_OF_MONTH));
                System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
                System.out.println("Год: " + calendar.get(Calendar.YEAR));
                break;
            }
            else{
                System.out.println("Вы нерпавильно ввели свою дату рождения. Повторите попытку.");
            }
        }

       BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        while (true){
            System.out.print("Введите свой номер телефона: ");
            String number = scanner.next();
            if (belarusPhoneValidator.validate(number)){
                seller.setPhone(number);
                break;
            }
            else{
                System.out.println("Вы неправильно ввели свой номер телефона. Повторите попытку.");
            }
        }

        EmailValidator emailValidator = new EmailValidator();
        while (true){
            System.out.print("Введите свою почту: ");
            String email = scanner.next();
            if (emailValidator.validate(email)){
                seller.setEmail(email);
                break;
            }
            else{
                System.out.println("Вы неправильно ввели свою почту. Повторите попытку");
            }
        }

        System.out.println("Добро пожаловать!!!");
        while (true){
            System.out.print("Еслм вы хотите добавить продукт(продукты) в корзину введите 1\n" +
                    "Если вы хотите удалить продукт из корзины введите 2\n" +
                    "Если вы хотите просмотреть корзину введите 3: ");
            int i = scanner.nextInt();
            switch (i){
                case 1 :
                    System.out.print("Введите количество продуктов, которые вы хотите добавить в карзину: ");
                    int n = scanner.nextInt();
                    if (check) {
                        check = false;
                        products = new Product[n];
                        for (int j = 0; j < n; j++){
                            while (true) {
                                System.out.print("Введите название продукта: ");
                                String nameProduct = scanner.next();
                                System.out.print("Введите количество этого продукта: ");
                                int quantity = scanner.nextInt();
                                if (nameProduct.equals("Meat")) {
                                    products[j] = new Meat("Meat", 100, quantity);
                                    break;
                                } else if (nameProduct.equals("Bread")) {
                                    products[j] = new Bread("Bread", 80, quantity);
                                    break;
                                } else if (nameProduct.equals("Milk")) {
                                    products[j] = new Milk("Milk", 60, quantity);
                                    break;
                                }
                                else {
                                    System.out.println("Я не знаю такого продукта. Повторите попыттку.");
                                }
                            }
                        }
                    }
                    else{
                        products = addProducts(products, n);
                    }
                    break;
                case 2:
                    products = deleteProduct(products, check1);
                    break;
                case 3:
                    countingProducts(products);
                    break;
                default:
                    System.out.println("Я не знаю такую команду. Повторите попытку.");
                    break;
            }
            System.out.print("Введите 1, если хотите продолжить выбор продуктов и 2, если хотите получить счёт: ");
            int endOperation = scanner.nextInt();
            if (endOperation == 2){
                break;
            }
        }

        Deal deal = new Deal(seller,buyer,products);

        deal.bill(deal);

        System.out.println(seller.getMoney());
        System.out.println(buyer.getMoney());
    }

    private static Product[] addProducts(Product[] products, int n){
            Product[] newProducts = new Product[products.length + n];
            for (int j = 0; j < products.length + n; j++){
                if (j < products.length) {
                    newProducts[j] = products[j];
                }
                else {
                    while (true) {
                        System.out.print("Введите название продукта: ");
                        String nameProduct = scanner.next();
                        System.out.print("Введите количество этого продукта: ");
                        int quantity = scanner.nextInt();
                        if (nameProduct.equals("Meat")) {
                            newProducts[j] = new Meat("Meat", 100, quantity);
                            break;
                        } else if (nameProduct.equals("Bread")) {
                            newProducts[j] = new Bread("Bread", 80, quantity);
                            break;
                        } else if (nameProduct.equals("Milk")) {
                            newProducts[j] = new Milk("Milk", 60, quantity);
                            break;
                        }
                        else {
                            System.out.println("Я не знаю такого продукта. Повторите попытку.");
                        }
                    }
                }
            }
           return newProducts;
    }

    private static Product[] deleteProduct(Product[] products, boolean check1){
        while (true) {
            for (int j = 0; j < products.length; j++) {
                if (products != null) {
                    check1 = false;
                    System.out.println("Ваша корзина пуста");
                    break;
                }
            }
            if (check1){
                System.out.println("Ваша корзина пуста");
                break;
            }
            check1 = true;
            System.out.print("Введите название продукта, который вы хотите удалить: ");
            String nameProduct = scanner.next();
                for (int c = 0; c < products.length; c++) {
                    if ((nameProduct.equals("Meat") || nameProduct.equals("Milk") || nameProduct.equals("Bread")) && products[c].getName().equals(nameProduct)) {
                        products[c] = null;
                        check1 = false;
                        for (int j = 0; j < products.length - 1; j++) {
                            if (products[j] == null) {
                                Product element = products[j + 1];
                                products[j + 1] = products[j];
                                products[j] = element;
                            }
                        }
                        break;
                    }
                }
                if (check1) {
                    System.out.println("Такого продукта нет в корзине. Повыторите попытку.");
                    check1 = true;
                }
                else{
                    break;
                }
        }
        return products;
    }

    private static void countingProducts(Product[] products){
        int sum = 0;
        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                System.out.println(products[j].getName() + " " + products[j].calePrice(products[j]));
                sum += products[j].calePrice(products[j]);
            }
        }
        System.out.println("Итоговая цена: " + sum);
    }

}
