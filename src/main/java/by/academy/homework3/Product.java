package by.academy.homework3;

public class Product {

    private double price;
    private String name;
    private int quality;
    private boolean isTax;

    public Product(double price, String name, int quality) {
        this.price = price;
        this.name = name;
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isTax() {
        return isTax;
    }

    public void setTax(boolean tax) {
        isTax = tax;
    }

    public double discount (){
        return 1;
    }

    public double calePrice (Product product){
        double sum = product.price * product.quality;
        return sum;
    }
}
