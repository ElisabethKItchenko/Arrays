//Написать программу, копирующую один массив в другой следующим образом: сначала копируются последовательно все элементы,
// большие 0, затем последовательно все элементы, равные 0, а затем последовательно все элементы, меньшие 0.

import java.util.Arrays;

public class Task_13 {

    public static void main(String[] args) {

        int n = 10, k = 0;

        int [] array1 = new int[n], array2 = new int[n];

        for (int i = 0; i < n; i++)
            array1 [i] = -2 + (int)(Math.random() * 4 + 1);

        for (int i = 0; i < n; i++) {
            if (array1[i] < 0)
                array2[k++] = array1[i];
        }

        for (int i = 0; i < n; i++) {
            if (array1[i] == 0)
                array2[k++] = array1[i];
        }

        for (int i = 0; i < n; i++) {
            if (array1[i] > 0)
                array2[k++] = array1[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


    }

}
