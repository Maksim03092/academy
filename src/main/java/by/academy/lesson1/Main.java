package by.academy.lesson1;

public class Main {

    static int age1;

    static String name;

    static boolean a;

    public static void main(String[] args) {

        Man max = new Man();
        max.setAge(18);
        max.setName("Max");
        System.out.println(max.grow() +" "+ max.getName());

        int age = 200;
        byte age1 = 1;
        System.out.println(age);

        System.out.println(age);

        System.out.println(age1);

        System.out.println(name);

        System.out.println(a);

        age1 = (byte)age;

        System.out.println(age1);

    }
}
