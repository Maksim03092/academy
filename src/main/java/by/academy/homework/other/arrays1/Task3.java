package by.academy.homework.other.arrays1;

public class Task3 {

    public static void main(String[] args) {

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10) + 1;
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                array[i] = 0;
            }
            System.out.print(array[i] + "\t");
        }
    }
}
