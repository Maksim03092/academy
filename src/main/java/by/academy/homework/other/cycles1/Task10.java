package by.academy.homework.other.cycles1;

public class Task10 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 50; i++){
            if (i % 5 == 0 || i % 7 ==0){
                System.out.print(i + "\t");
                sum +=i;
            }
        }
        System.out.println("\n"+sum);
    }
}
