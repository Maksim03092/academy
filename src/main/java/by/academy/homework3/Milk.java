package by.academy.homework3;

import java.util.Objects;

public class Milk extends Product {

    private String percentFat;

    public Milk(String name, int quality, double price) {
        super(name, quality, price);
    }

    public String getPercentFat() {
        return percentFat;
    }

    public void setPercentFat(String percentFat) {
        this.percentFat = percentFat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milk milk = (Milk) o;
        return Objects.equals(percentFat, milk.percentFat);
    }

    @Override
    public String toString() {
        return "Milk{" +
                "percentFat='" + percentFat + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", quality=" + quality +
                '}';
    }

    @Override
    public double calePrice(Product product) {
        double sum = this.price * quality * 0.8;
        return sum;
    }
}
