package by.academy.homework.other.arrays1;

public class Task16 {

    public static void main(String[] args) {

        int[][] array = new int[7][4];
        int max1 = 1, max2 = 1, index = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * 11) - 5;
                System.out.print(array[i][j] + "\t");
                if (i == 0) {
                    max1 *= Math.abs(array[i][j]);
                    index = i;
                }
                else {
                    max2 *= Math.abs(array[i][j]);
                }
            }
            if (max1 < max2 && i > 0) {
                max1 = max2;
                index = i;
            }
            max2 = 1;
            System.out.println("\n");
        }
        System.out.println(index);
    }
}
