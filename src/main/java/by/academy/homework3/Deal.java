package by.academy.homework3;


import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Deal {

    private static Scanner scanner = new Scanner(System.in);

    private User seller;
    private User buyer;
    private Product[] products;
    private Date deadlineDate;

    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public double fullPrice(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].calePrice(products[i]);
        }
        return sum;
    }

    public void bill (Deal deal){
        System.out.println(deal.seller.getName());
        if (seller.getMoney() < fullPrice(products)){
            System.out.println("Вы не можете купить данные продукы");
        }
        else {
            for (int i = 0; i < deal.products.length; i++) {
                System.out.println(deal.products[i].getName() + " " + deal.products[i].calePrice(products[i]));
            }
            System.out.println("Итоговая цена: " + fullPrice(products));
        }
        deal.seller.setMoney(deal.seller.getMoney() + fullPrice(products));
        deal.buyer.setMoney(deal.buyer.getMoney() - fullPrice(products));
    }
}
