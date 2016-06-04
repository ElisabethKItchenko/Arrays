//Создать массив из 200 случайных чисел в диапазоне от 0 до 200.
// Определить количество одноразрядных, двухразрядных и трёхразрядных чисел в процентном отношении.


// TODO: 5/17/16 проценты!!

public class Task_10 {

    public static void main(String[] args) {

        int n = 200;

        int[] array = new int[n];

        int oneDigit = 0, twoDigits = 0, threeDigits = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = 0 + (int) (Math.random() * ((200 - 0) + 1));
            System.out.println(array[i]);

            if (array[i] < 10)
                oneDigit++;
            if (array[i] < 100 && array [i] >= 10)
                twoDigits++;
            if (array[i] < 200 && array[i] >= 100)
                threeDigits++;
        }


        System.out.println(((double)(oneDigit/n)*100) + " percents of one digit numbers.");// не работает((
        System.out.println((double)((twoDigits/n)*100)+ " percents of two digits numbers");// и я не знаю, как это реализовать
        System.out.println(threeDigits + " percents of three digits numbers.");
    }
}