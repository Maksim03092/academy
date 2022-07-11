package by.academy.homework3;

import java.util.Objects;

public class Meat extends Product{

    private String sort;

    public Meat(String name, int quality, double price) {
        super(name, quality, price);
    }

    public String getType() {
        return sort;
    }

    public void setType(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "sort='" + sort + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", quality=" + quality +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meat meat = (Meat) o;
        return Objects.equals(sort, meat.sort);
    }

    @Override
    public double calePrice(Product product) {
        double sum = this.price * quality * 0.9;
        return sum;
    }
}
