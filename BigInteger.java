import java.util.*;

public class BigInteger {

    public static String getDiffOfNumbers(String s1, String s2) {
        String diff = "";
        char[] firstNumber = s1.toCharArray();
        char[] secondNumber = s2.toCharArray();
        int len = 0;
        boolean isDiffPositive = true;
        if (s1.equals(s2)) {
            return diff = "0";
        }
        if (s1.length() == s2.length()) {
            boolean isFirstBigger = true;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    break;
                } else if (s2.charAt(i) >  s1.charAt(i)) {
                    isFirstBigger = false;
                    break;
                }
            }

            if (isFirstBigger) {
                len = firstNumber.length;
                char[] secondNumbScaled = new char[len];

                for (int i = 0; i < len; i++) {
                    secondNumbScaled[i + len - secondNumber.length] = secondNumber[i];
                }

                for (int i = len - 1; i >= 0; i--) {
                    if (secondNumbScaled[i] == 0) {
                        if (!isDiffPositive) {
                            firstNumber[i] -= 1;
                            isDiffPositive = true;
                            if (firstNumber[i] == '0') {
                                continue;
                            }
                        }
                        diff += firstNumber[i];
                        continue;
                    }
                    if (!isDiffPositive) {
                        firstNumber[i] -= 1;
                    }
                    if (firstNumber[i] - secondNumbScaled[i] > 0) {
                        diff += firstNumber[i] - secondNumbScaled[i];
                        isDiffPositive = true;
                        continue;
                    } else if (firstNumber[i] == secondNumbScaled[i]) {
                        diff += 0;
                        isDiffPositive = true;
                        continue;
                    }
                    if (firstNumber[i] - secondNumbScaled[i] < 0) {
                        diff += firstNumber[i] + 10 - secondNumbScaled[i];
                        isDiffPositive = false;
                    }
                }
            }
            if (!isFirstBigger) {
                len = secondNumber.length;
                char[] firstNumbScaled = new char[len];

                for (int i = 0; i < len; i++) {
                    firstNumbScaled[i + len - firstNumber.length] = firstNumber[i];
                }

                for (int i = len - 1; i >= 0; i--) {
                    if (firstNumbScaled[i] == 0) {
                        if (!isDiffPositive) {
                            secondNumber[i] -= 1;
                            isDiffPositive = true;
                            if (secondNumber[i] == '0') {
                                continue;
                            }
                        }
                        diff += secondNumber[i];
                        continue;
                    }
                    if (!isDiffPositive) {
                        secondNumber[i] -= 1;
                    }
                    if (secondNumber[i] - firstNumbScaled[i] > 0) {
                        diff += secondNumber[i] - firstNumbScaled[i];
                        isDiffPositive = true;
                        continue;
                    } else if (secondNumber[i] - firstNumbScaled[i] == 0) {
                        isDiffPositive = true;
                        continue;
                    }
                    if (secondNumber[i] - firstNumbScaled[i] < 0) {
                        diff += secondNumber[i] + 10 - firstNumbScaled[i];
                        isDiffPositive = false;
                    }
                }
            }
        }
        if (s1.length() > s2.length()) {
            len = firstNumber.length;
            char[] secondNumbScaled = new char[len];

            for (int i = 0; i < secondNumber.length; i++) {
                secondNumbScaled[i + len - secondNumber.length] = secondNumber[i];
            }

            for (int i = len - 1; i >= 0; i--) {
                if (secondNumbScaled[i] == 0) {
                    if (!isDiffPositive) {
                        firstNumber[i] -= 1;
                        isDiffPositive = true;
                        if (firstNumber[i] == '0') {
                            continue;
                        }
                    }
                    diff += firstNumber[i];
                    continue;
                }
                if (!isDiffPositive) {
                    firstNumber[i] -= 1;
                }
                if (firstNumber[i] >= secondNumbScaled[i]) {
                    diff += firstNumber[i] - secondNumbScaled[i];
                    isDiffPositive = true;
                    continue;
                }
                if (firstNumber[i] <= secondNumbScaled[i]) {
                    diff += firstNumber[i] + 10 - secondNumbScaled[i];
                    isDiffPositive = false;
                }
            }
        }
        if (s1.length() < s2.length()) {
            len = secondNumber.length;
            char[] firstNumbScaled = new char[len];

            for (int i = 0; i < firstNumber.length; i++) {
                firstNumbScaled[i + len - firstNumber.length] = firstNumber[i];
            }

            for (int i = len - 1; i >= 0; i--) {
                if (firstNumbScaled[i] == 0) {
                    if (!isDiffPositive) {
                        secondNumber[i] -= 1;
                        isDiffPositive = true;
                        if (secondNumber[i] == '0') {
                            continue;
                        }
                    }
                    diff += secondNumber[i];
                    continue;
                }
                if (!isDiffPositive) {
                    secondNumber[i] -= 1;
                }
                if (secondNumber[i] >= firstNumbScaled[i]) {
                    diff += secondNumber[i] - firstNumbScaled[i];
                    isDiffPositive = true;
                    continue;
                }
                if (secondNumber[i] <= firstNumbScaled[i]) {
                    diff += secondNumber[i] + 10 - firstNumbScaled[i];
                    isDiffPositive = false;
                }
            }
        }
        char[] properDiff = new char[diff.length()];
        for (int i = 0; i <= diff.length() - 1; i++) {
            properDiff[diff.length() - i - 1] = diff.charAt(i);
        }
        for (int i = 0; i <= properDiff.length; i++) {
            if (properDiff[i] == 48) {
                properDiff[i] = ' ';
            } else  {
                break;
            }
        }
        diff = new String(properDiff);
        diff = diff.replaceAll(" ","");
        return diff;
    }
}


