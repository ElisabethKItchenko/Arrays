//Создать массив из 20 случайных чисел. Определить минимальный и максимальный элемент массива (вывести значение и порядковый номер).

import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {
        int [] array = new int[20];
        Random r = new Random();

        int max = 0, maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50);
            System.out.println(array[i]);

            if (array[i] > max)
            {
                max = array[i];
                maxIndex = i;
            }
        }

        int min = array[0], minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
            {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("The maximum is " + max + " and its index is " + maxIndex + ".");
        System.out.println("The minimum is " + min + " and its index is " + minIndex + ".");

    }


}
