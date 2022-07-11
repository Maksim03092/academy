package by.academy.lesson8.classwork;

public class Main {

    public static void main(String[] args) {

        Phone samsung = new Phone("+375336969491", "samsung", 100);
        Phone apple = new Phone("+375295962887","apple",200);
        Phone vivo = new Phone("+375296970367","vivo", 300);

        samsung.sendMessages("+375336969491", "+375335962887");
    }
}
