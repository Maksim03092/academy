package by.academy.lesson2.classwork;

public class Aplication {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Max");
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println(cat1.getAge());
        System.out.println(cat2.getInitials());

    }
}
