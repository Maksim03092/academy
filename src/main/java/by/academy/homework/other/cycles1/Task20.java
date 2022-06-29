package by.academy.homework.other.cycles1;

public class Task20 {

    public static void main(String[] args) {

        for (int i = 10; i < 100; i++){
            for (int j = 10; j < 100; j++){
                int number1 = i * 100 + j;
                int number2 = j * 100 + i;
                if (number1 % 99 == 0 && number2 % 49 == 0){
                    System.out.println(i + "\t" + j);
                    System.out.println(number1 + "\t" + number2);
                }
            }
        }
    }
}
