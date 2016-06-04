//Создать массив из 20 случайных чисел в диапазоне от -10 до 20.
// Определить максимальное количество подряд идущих положительных элементов, не прерываемых ни нулями, ни отрицательными числами. Вывести найденный фрагмент.

import java.util.Arrays;

public class Task_16 {

    public static void main(String[] args) {


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = -10 + (int) (Math.random() * ((20 - (-10)) + 1));
        System.out.println(Arrays.toString(array));

        int k = 0, k1 = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > 0 && array[i + 1] > 0)
                k1++;
            else if (k1 > k)
            {
                k = k1;
                k1 = 0;
            }
            if  ((i == array.length-2) && (k1 > k))
                k = k1;
        }


        System.out.println(k+1);

    }
}
