//Создать массив на 10 вещественных чисел. Определить, сколько элементов массива не имеют вещественной части.

public class Task_9 {

    public static void main(String[] args) {


        double[] array = {9.5, 4.0, 6.0, 9.7, 0.8, 7.8, 4.0, 1.0, 9.6, 8.6};
        int count = 0, noFloatingPointNumbersQuantity = 0;

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
            if (array[i] % 1 > 0){
                count++;}
            noFloatingPointNumbersQuantity = array.length - count;

        }
        System.out.println(noFloatingPointNumbersQuantity + " is the amount of non floating point numbers.");
    }
}


