//Ввести массив из 5 чисел, а затем вывести его в обратном порядке.

public class Task_1 {
    public static void main(String[] args) {
        int [] array = new int[5];
        int i;

        for (i = 0; i <array.length ; i++) {
            array[i] = i;
            System.out.print(" " +array[i]);
        }

        System.out.println(" ");
        for (int j = array.length - 1; j >= 0; j--)
        {
            System.out.print(" "+ array[j]);
        }
    }
}
