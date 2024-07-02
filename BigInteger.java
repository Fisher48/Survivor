import java.util.*;

public class BigInteger {

    private static final int SUBTRACTION_DEPTH = 10;

    public static String getDifference(int len, char[] firstNumber, char[] secondNumbScaled) {
        boolean isDiffPositive = true;
        StringBuilder diff = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (secondNumbScaled[i] == 0) {
                if (!isDiffPositive) {
                    firstNumber[i] -= 1;
                    isDiffPositive = true;
                    if (firstNumber[i] == '0') {
                        continue;
                    }
                }
                diff.append(firstNumber[i]);
                continue;
            }
            if (!isDiffPositive) {
                firstNumber[i] -= 1;
            }
            if (firstNumber[i] - secondNumbScaled[i] > 0) {
                diff.append(firstNumber[i] - secondNumbScaled[i]);
                isDiffPositive = true;
                continue;
            } else if (firstNumber[i] == secondNumbScaled[i]) {
                diff.append(0);
                isDiffPositive = true;
                continue;
            }
            if (firstNumber[i] - secondNumbScaled[i] < 0) {
                diff.append(firstNumber[i] + SUBTRACTION_DEPTH - secondNumbScaled[i]);
                isDiffPositive = false;
            }
        }
        return diff.toString();
    }

    public static String getDiffOfNumbers(String s1, String s2) {
        if (s1.matches(".*\\D.*") || s2.matches(".*\\D.*")) {
            throw new IllegalArgumentException("Строка содержит не числовой символ");
        }
        if (s1.equals(s2)) {
            return "0";
        }
        String diff = "";
        char[] firstNumber = s1.toCharArray();
        char[] secondNumber = s2.toCharArray();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    char[] secondNumbScaled = Arrays.copyOf(secondNumber, firstNumber.length);
                    diff = getDifference(firstNumber.length, firstNumber, secondNumbScaled);
                    break;
                } else if (s2.charAt(i) >  s1.charAt(i)) {
                    char[] firstNumbScaled = Arrays.copyOf(firstNumber, secondNumber.length);
                    diff = getDifference(secondNumber.length, secondNumber, firstNumbScaled);
                    break;
                }
            }
        }
        if (s1.length() > s2.length()) {
            char[] secondNumbScaled = new char[firstNumber.length];
            System.arraycopy(secondNumber, 0, secondNumbScaled, firstNumber.length - secondNumber.length, secondNumber.length);
            diff = getDifference(firstNumber.length, firstNumber, secondNumbScaled);
        }
        if (s1.length() < s2.length()) {
            char[] firstNumbScaled = new char[secondNumber.length];
            System.arraycopy(firstNumber, 0, firstNumbScaled, secondNumber.length - firstNumber.length, firstNumber.length);
            diff = getDifference(secondNumber.length, secondNumber, firstNumbScaled);
        }

        final int ZERO = 48;
        char[] properDiff = new char[diff.length()];
        for (int i = 0; i <= diff.length() - 1; i++) {
            properDiff[diff.length() - i - 1] = diff.charAt(i);
        }
        // Необходимо удалить лишние нули (в начале числа), которые образовались при разности чисел.
        // Если это не сделать, число может получиться некорректным.
        for (int i = 0; i <= properDiff.length; i++) {
            if (properDiff[i] == ZERO) {
                properDiff[i] = ' ';
            } else {
                break;
            }
        }
        return String.valueOf(properDiff).replace(" ","");
    }
}


