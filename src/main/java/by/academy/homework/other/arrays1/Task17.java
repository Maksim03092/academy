package by.academy.homework.other.arrays1;

public class Task17 {

    public static void main(String[] args) {

        int [][] array = new int[6][7];
        int max = 0, index = 0;
        boolean firstMax = true;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j] || firstMax == true){
                    max = array[i][j];
                    firstMax = false;
                    index = j;
                }
                if (j == array[i].length - 1){
                    array[i][index] = array[i][0];
                    array[i][0] = max;
                }
            }
            max = 0;
            firstMax = true;
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
