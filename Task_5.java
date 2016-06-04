//Написать программу, которая предлагает пользователю ввести число, и затем подсчитывает,
// сколько раз это число встречается в массиве на 100 случайных элементов.

import java.util.Random;
import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        System.out.println("Please input the number!");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random r = new Random();
        int count = 0;

        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);

            System.out.println(array[i]);

            if (array[i] == a)
                count++;
        }
        System.out.println("There are " + count + " coincidences.");
    }
}
