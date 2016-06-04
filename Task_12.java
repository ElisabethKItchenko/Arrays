//Создать два массива A и B по 5 элементов. Создать третий массив C на 10 элементов,
// в который копируются элементы из первого и второго массива поочередно (например, С[0]=A[0], c[1]=B[0], C[2]=A[1], C[3]=B[1] и тд).


import java.util.Arrays;
import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        int [] arrayA = new int[5]; int [] arrayB = new int[5]; int [] arrayC = new int[10];

        Random r = new Random();
        int k = 0;

            for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = r.nextInt(50);
            }
        System.out.println(Arrays.toString(arrayA));
            for (int j = 0; j < arrayB.length; j++) {
                arrayB[j] = r.nextInt(100);
            }
        System.out.println(Arrays.toString(arrayB));


        for (int i = 0; i < arrayA.length; i++) {
            arrayC[k++] = arrayA[i];
            arrayC[k++] = arrayB[i];

        }
        System.out.println(Arrays.toString(arrayC));
        }




    }
