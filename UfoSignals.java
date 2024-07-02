import java.util.*;

public class UfoSignals {

    private static final int OCTAL = 8;
    private static final int HEXADECIMAL = 16;

    // UFO получает на вход длину N цифровой записи трафика, сам трафик (последовательность положительных чисел) в массиве data, и флажок numberSystem,
    // который задаёт систему счисления входных данных: восьмеричная если numberSystem = true, и шестнадцатеричная в противном случае.
    // Функция возвращает массив длины N, содержащий исходные числа, преобразованные в десятичную систему счисления.
    public static int [] UFO(int N, int [] data, boolean numberSystem) {

       int[] decimalCode = new int[N];
       int count = 0;
       for (int j = 0; j < N; j++) {
           int currentNumb = data[j];
           int temp = currentNumb;
           while (currentNumb > 0) {
               count++;
               currentNumb /= 10;
           }
           int[] digits = new int[count];
           currentNumb = data[j];
           for (int k = 0; k < count; k++) {
               temp %= 10;
               currentNumb /= 10;
               digits[k] = temp;
               temp = currentNumb;
           }
           int numb = 0;
           for (int i = 0; i < count; i++) {
               int ratio = !numberSystem ? HEXADECIMAL : OCTAL;
               int extent = (int) Math.pow(ratio, i);
               numb += extent * digits[i];
           }
           decimalCode[j] = numb;
           count = 0;
       }
       return decimalCode;
   }
}


