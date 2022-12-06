package by.academy.lesson17.classwork;

import java.util.Objects;

public class Toy {

    private String name;
    private String color;
    private String  weight;

    public Toy(String name, String color, String weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name) && Objects.equals(color, toy.color) && Objects.equals(weight, toy.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight);
    }
}
