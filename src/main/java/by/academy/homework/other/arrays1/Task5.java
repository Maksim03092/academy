package by.academy.homework.other.arrays1;

public class Task5 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        double sum1 = 0, sum2 = 0;
        int[] array2 = new int[5];

        for (int i = 0; i < array2.length; i++){
            array1[i] = (int) (Math.random() * 6);
            sum1 += array1[i];
            array2[i] = (int) (Math.random() * 6);
            sum2 += array2[i];
        }
        for (int i = 0; i < array2.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + "\t");
        }
        System.out.println("\n");
        sum1 = sum1 / array1.length;
        System.out.println(sum1);
        sum2 = sum2 / array2.length;
        System.out.println(sum2);
        System.out.println("\n");
        if (sum1 > sum2){
            System.out.println("Среднее арифметического для первого массива больше");
        }
        else if (sum1  < sum2){
            System.out.println("Среднее арифметического второго массива больше чем у первого");
        }
        else{
            System.out.println("Средние арифметические равны");
        }
    }
}
