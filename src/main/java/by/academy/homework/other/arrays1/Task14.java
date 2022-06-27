package by.academy.homework.other.arrays1;

public class Task14 {

    public static void main(String[] args) {

        int[][] array = new int[8][5];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
