//Создать массив из 20 случайных чисел в диапазоне от -30 до 10.
// Написать программу, определяющую сумму элементов массива, находящихся в массиве до первого положительного элемента.

public class Task_7 {

    public static void main(String[] args) {

        int [] array = new int[20];
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            array [i] =  -30 + (int)(Math.random() * ((10 - (-30)) + 1));
            System.out.println(array[i]);

        }

        int a = 0;
        while (array[a++] <= 0 );

        System.out.println("a = "+ a);

        for (int i = 0; i < a - 1; i++)
            sum += array[i];

        System.out.println("The sum of all elements preceding the positive one is " + sum + ".");


}
}

