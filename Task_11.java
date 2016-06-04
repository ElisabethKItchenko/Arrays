//Создать массив из 10 целых случайных чисел.
// Изменить порядок следования элементов массива на противоположный (1-й элемент меняется с 10-м, 2-й элемент с 9-м и тд).

public class Task_11 {
    public static void main(String[] args) {

        int[] array = new int[10];

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random()*20+1;
            System.out.println(array[i]);
        }

        System.out.println("The reversed array is:");

        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array [array.length - i - 1];
            array[array.length - i - 1] = temp;

        }

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}