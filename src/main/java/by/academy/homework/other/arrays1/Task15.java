package by.academy.homework.other.arrays1;

public class Task15 {

    public static void main(String[] args) {

        int[][] array = new int[5][8];
        int max = 0;
        boolean firstMax = true;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * 199) - 99;
                System.out.print(array[i][j] + "\t");
                if (firstMax == true || max < array[i][j]){
                    max = array[i][j];
                    firstMax = false;
                }
            }
            System.out.print("\n");
        }
        System.out.print(max);
    }
}
