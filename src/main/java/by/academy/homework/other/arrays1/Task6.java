package by.academy.homework.other.arrays1;

public class Task6 {

    public static void main(String[] args) {

        int[] array = new int[4];
        boolean check = true, check1 = true;
        int max = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 89) + 10;
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length; i++){
            if (check1 || max < array[i]){
                max = array[i];
                check1 = false;
            }
            else {
                check = false;
                break;
            }
        }
        System.out.println("\n");
        if (check == true){
            System.out.println("Массив со строго возвращающейся последовательностью");
        }
        else {
            System.out.println("Массив без строго возвращающейся последовательности");
        }
    }
}
