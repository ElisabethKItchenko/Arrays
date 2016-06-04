//Даны 2 массива размерности M и N соответственно. Необходимо переписать в третий массив общие элементы первых двух массивов, без повторений.

import java.util.Arrays;

public class Task_14 {

    public static boolean checkValueExistence(int [] array, int value){
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
         if (array[i] == value)
         {result = true; break;}
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5, m = 7, k = 0;
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        int[] array3 = new int[n + m];
        Arrays.fill(array3, -10);

        for (int i = 0; i < (m > n ? m : n); i++)
        {
            if (i<n)
                array1[i] = -2 + (int) (Math.random() * 4 + 1);
            if (i<m)
                array2[i] = -2 + (int) (Math.random() * 4 + 1);

    }

        for (int i = 0; i < array1.length; i++) {
           if (!checkValueExistence(array3, array1[i]))
            array3[k++] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            if (!checkValueExistence(array3, array2[i]))
                array3[k++] = array2[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < k; i++) {
            System.out.println(array3[i]);

        }
    }

}
