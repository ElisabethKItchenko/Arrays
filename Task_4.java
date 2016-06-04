//Создать символьный массив из 100 случайных элементов. Определить, сколько в нём цифр, букв и знаков пунктуации.

public class Task_4 {
    public static void main(String[] args) {
        char [] array = new char[100];

int countLetter = 0, countDigit = 0, countPunctuationSign = 0;

        for (int i = 0; i < array.length; i++) {
           array[i] = (char) (33 + (int)(Math.random() * ((122 - (33)) + 1)));
                    System.out.println(array[i]);

            if (i == 33 || i == 44 || i == 46 || i == 58 || i == 59 || i == 63)
                        countPunctuationSign++;
            if (i >= 48 && i <= 57)
                        countDigit++;
            if (i >= 97 && i <= 122)
                countLetter++;

        }
        System.out.println("The number of punctuation marks equals " + countPunctuationSign);
        System.out.println("The number of digits equals "+countDigit);
        System.out.println("The number of letters equals " + countLetter);
    }
}
