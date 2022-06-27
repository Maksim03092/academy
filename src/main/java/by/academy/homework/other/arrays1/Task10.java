package by.academy.homework.other.arrays1;

public class Task10 {

    public static void main(String[] args) {

        int[] array = new int[11];
        int k0 = 0, k_1 = 0, k1 = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 3) - 1;
            if (array[i] == -1){
                k_1++;
            }
            else if (array[i] == 0){
                k0++;
            }
            else{
                k1++;
            }
        }
        for (int element : array){
            System.out.print(element + "\t");
        }
        System.out.println("\n");
        if (k_1 > k0 && k_1 > k1){
            System.out.println("-1 встречается наиболее всего");
        }
        else if (k0 > k_1 && k0 > k1){
            System.out.println("0 встречается наиболее всего");
        }
        else if (k1 > k0 && k1 > k_1){
            System.out.println("1 встречается наиболее всего");
        }
        else{
            System.out.println("Ничего не выводим");
        }
    }
}
