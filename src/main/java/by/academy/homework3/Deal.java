package by.academy.homework3;

public class Deal {

    private User seller;
    private User buyer;
    private Product[] products;

    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public double fullPrice(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice() * products[i].getQuality();
        }
        return sum;
    }
    public void bill (Deal deal){
        int sum = 0;
        System.out.println(deal.seller.getName());
        for (int i = 0; i < deal.products.length; i++){
            System.out.println(deal.products[i].getName() + "\t" +  deal.products[i].calePrice(products[i]));
            sum += deal.products[i].calePrice(products[i]);
        }
        System.out.println("Итоговая цена: " + sum);
    }
}
