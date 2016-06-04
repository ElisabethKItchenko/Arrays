// Создать массив из 20 случайных чисел в диапазоне от -10 до 30.
// Написать программу, определяющую сумму элементов массива, находящихся в массиве после первого отрицательного элемента.

public class Task_6 {
    public static void main(String[] args) {

        int [] array = new int[20];

        for (int i = 0; i < array.length ; i++) {
            array [i] =  -10 + (int)(Math.random() * ((30 - (-10)) + 1));

        }
        int a = 0;
        while (array[a++] >= 0 );

        System.out.println("a = "+a);

        int sum = 0;
        for (int i = a; i < array.length; i++) {
           sum += array[i];
        }

        System.out.println("The sum of all elements following the negative one is " + sum + ".");
    }
}
