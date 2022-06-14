package by.academy.lesson2.classwork;

public class Cat {

    private int age;

    private String nickname;

    private double money;

    private char initials;

    private boolean isHomeAnimal;

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void walk() {
        System.out.println("Кот гуляет");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return nickname;
    }

    public void setName(String name) {
        this.nickname = name;
    }

    public Cat() {
    }

    public Cat(String name) {
        this.nickname = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public char getInitials() {
        return initials = nickname.charAt(0);
    }

    public void setInitials() {
        this.initials = nickname.charAt(0);
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }
}
