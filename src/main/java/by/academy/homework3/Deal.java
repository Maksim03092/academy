package by.academy.homework3;


import javax.security.sasl.SaslClient;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Deal {

    private User seller;
    private User buyer;
    private Product[] products;
    private LocalDate deadlineDate = LocalDate.now().plusDays(10);

    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                ", deadlineDate=" + deadlineDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Arrays.equals(products, deal.products) && Objects.equals(deadlineDate, deal.deadlineDate);
    }

    public double fullPrice(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                sum += products[i].calePrice(products[i]);
            }
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
                if (deal.products[i] != null) {
                    System.out.println(deal.products[i].getName() + " " + deal.products[i].calePrice(products[i]));
                }
            }
            System.out.println("Итоговая цена: " + fullPrice(products));
        }
        deal.seller.setMoney(deal.seller.getMoney() + fullPrice(products));
        deal.buyer.setMoney(deal.buyer.getMoney() - fullPrice(products));
    }
}
