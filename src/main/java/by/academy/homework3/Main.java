package by.academy.homework3;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean check = true;
        Product[] products = null;

        User seller = new User("Max",1000);
        User buyer = new User("Nick", 1000);

        Date date = new Date();
/*        while (true) {
            System.out.print("Введите свою дату рождения: ");
            String date1 = scanner.next();
            if (date.checkDate(date1)){
                seller.setDateOfBirch(date1);
                System.out.println(seller.getDateOfBirch());
                break;
            }
            else{
                System.out.println("Вы нерпавильно ввели свою дату рождения. Повторите попытку.");
            }
        }
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        while (true){
            System.out.println("Введите свой номер телефона");
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
            System.out.println("Введите свою почту: ");
            String email = scanner.next();
            if (emailValidator.validate(email)){
                seller.setEmail(email);
                break;
            }
            else{
                System.out.println("Вы неправильно ввели свою почту. Повторите попытку");
            }
        }*/


        System.out.println("Добро пожаловать!!!");
        while (true){
            System.out.print("Еслм вы хотите добавить продукт(продукты) в корзину введите 1\n" +
                    "Если вы хотите удалить продукт с корзины введите 2\n" +
                    "Если вы хотите просмотреть корзину введите 3: ");
            int i = scanner.nextInt();
            switch (i){
                case 1 :
                    System.out.println("Введите количество продуктов, которые вы хотите добавить в карзину: ");
                    int n = scanner.nextInt();
                    if (check) {
                        check = false;
                        products = new Product[n];
                        for (int j = 0; j < n; j++){
                            while (true) {
                                System.out.println("Введите название продукта: ");
                                String nameProduct = scanner.next();
                                System.out.println("Введите количество этого продукта: ");
                                int quantity = scanner.nextInt();
                                if (nameProduct.equals("Meat")) {
                                    products[j] = new Meat("Meat", quantity, 100);
                                    break;
                                } else if (nameProduct.equals("Bread")) {
                                    products[j] = new Bread("Bread", quantity, 80);
                                    break;
                                } else if (nameProduct.equals("Milk")) {
                                    products[j] = new Milk("Milk", quantity, 60);
                                    break;
                                }
                                else {
                                    System.out.println("Я не знаю такого продукта. Повторите попыттку.");
                                }
                            }
                        }
                    }
                    else{
                        addProducts(products, n);
                    }
                    break;
                case 2:
                    deleteProduct(products);
                    break;
                case 3:
                    int sum = 0;
                    for (int j = 0; j < products.length; j++){
                        System.out.println(products[j].getName() + " " + products[j].calePrice(products[j]));
                        sum += products[j].calePrice(products[j]);
                    }
                    System.out.println("Итоговая цена: " + sum);
                    break;
                default:
                    System.out.println("Я не знаю такую команду. Повторите попытку.");
                    break;
            }
            System.out.println("Введите 1, если хотите продолжить и 2, если хотите прекратить: ");
            int endOperation = scanner.nextInt();
            if (endOperation == 2){
                break;
            }
        }

        Deal deal = new Deal(seller,buyer,products);

        deal.fullPrice(products);

        deal.bill(deal);

        System.out.println(seller.getMoney());
        System.out.println(buyer.getMoney());
    }
    private static void addProducts(Product[] products, int n){
            Product[] newProducts = new Product[products.length + n];
            for (int j = 0; j < products.length + n; j++){
                if (j < products.length) {
                    newProducts[j] = products[j];
                }
                else {
                    while (true) {
                        System.out.println("Введите название продукта: ");
                        String nameProduct = scanner.next();
                        System.out.println("Введите количество этого продукта: ");
                        int quantity = scanner.nextInt();
                        if (nameProduct.equals("Meat")) {
                            newProducts[j] = new Meat("Meat", quantity, 100);
                            break;
                        } else if (nameProduct.equals("Bread")) {
                            newProducts[j] = new Bread("Bread", quantity, 80);
                            break;
                        } else if (nameProduct.equals("Milk")) {
                            newProducts[j] = new Milk("Milk", quantity, 60);
                            break;
                        }
                        else {
                            System.out.println("Я не знаю такого продукта. Повторите попытку.");
                        }
                    }
                }
            }
            products = newProducts;

    }
    private static void deleteProduct(Product[] products){
        while (true) {
            if (products == null){
                System.out.println("Ваша корзина пуста");
                break;
            }
            Product[] newProduct = new Product[products.length - 1];
            System.out.println("Введите название продукта, который вы хотите удалить");
            String nameProduct = scanner.next();
            if (nameProduct.equals("Meat") || nameProduct.equals("Milk") || nameProduct.equals("Bread")) {
                for (int j = 0; j < products.length; j++){
                    if (products[j].getName().equals(nameProduct)){
                        products[j] = null;
                        break;
                    }
                }
                for (int j = 0; j < products.length - 1; j++){
                    if (products[j] == null){
                        Product element = products[j + 1];
                        products[j + 1] = products[j];
                        products[j] = element;
                    }
                    newProduct[j] = products[j];
                }
                products = newProduct;
                break;
            }
            else {
                System.out.println("Я не знаю такого продукта. Повыторите попытку.");
            }
        }
    }
}
