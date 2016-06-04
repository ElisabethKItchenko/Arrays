//Создать массив из 10 случайных чисел в диапазоне от -20 до 20. Определить количество, сумму  и среднее арифметическое положительных элементов массива.

//Для генерации целого случайного числа в заданном диапазоне от Min до Max, обычно используется следующий паттерн:
//
//        Min + (int)(Math.random() * ((Max - Min) + 1))

public class Task_3 {

    public static void main(String[] args) {
        int [] array = new int[10];
        int count = 0, sum = 0, average = 0;

        for (int i = 0; i < array.length ; i++) {
            array [i] = -20 + (int)(Math.random() * ((20 - (-20)) + 1));
            System.out.println(array[i]);

            if (array[i] > 0) {

                count++;
                sum += array[i];
            }
        }

        average = sum/count;

        System.out.println("The quantity of positive numbers is " + count + ".");
        System.out.println("The sum of positive elements of the array is " + sum + ".");
        System.out.println("The average is " + average + ".");
    }
}
