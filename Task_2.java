//Создать массив из 20 случайных чисел. Вывести все элементы массива с чётными индексами.

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int [] array = new int [20];

        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50);

            if (i % 2 == 0)
            System.out.println(array[i]);
        }

    }
}
