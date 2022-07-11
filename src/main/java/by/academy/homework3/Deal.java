package by.academy.homework3;

public class Deal {

    private User seller;
    private User buyer;
    private Product[] products;
    private double sum;
    private Date deadlineDate;




    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public double fullPrice(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice() * products[i].getQuality();
        }
        return sum;
    }

    public void bill (Deal deal){
        System.out.println(deal.seller.getName());
        if (seller.getMoney() < sum){
            System.out.println("Вы не можете купить данные продукы");
        }
        else {
            for (int i = 0; i < deal.products.length; i++) {
                System.out.println(deal.products[i].getName() + " " + deal.products[i].calePrice(products[i]));
            }
            System.out.println("Итоговая цена: " + sum);
        }
        deal.seller.setMoney(deal.seller.getMoney() - sum);
        deal.buyer.setMoney(deal.buyer.getMoney());
    }
}
