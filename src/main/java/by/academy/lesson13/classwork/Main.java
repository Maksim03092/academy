package by.academy.lesson13.classwork;

public class Main {

    public static void main(String[] args) {

        User user = new User("maxim", "13579");

        user.createQuery();

        User.Query query = new User.Query("Maxim", "2468");
    }
}
