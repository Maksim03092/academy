package by.academy.homework.other.arrays1;

public class Task12 {

    public static void main(String[] args) {

        int[] array = new int[12];
        int positiveNumbers = 6, negativeNumber = 6;

        for (int i = 0; i < array.length; i++) {
            while (true) {
                int k = (int) (Math.random() * 21) - 10;
                if (k == 0) {
                    continue;
                }
                else if (positiveNumbers == 0 && k > 0){
                    continue;
                }
                else if (negativeNumber == 0 && k < 0){
                    continue;
                }
                else {
                    if (k > 0) {
                        array[i] = k;
                        positiveNumbers--;
                        break;
                    } else {
                        array[i] = k;
                        negativeNumber--;
                        break;
                    }
                }
            }
        }
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
