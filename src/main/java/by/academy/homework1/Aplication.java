package by.academy.homework1;

public class Aplication {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Max");

        cat2.eat();
        cat2.sleep();
        cat2.walk();

        cat1.grow();
        cat1.grow();
        cat1.grow();

        System.out.println(cat1.age);
    }
}
