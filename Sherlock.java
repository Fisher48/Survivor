import java.util.*;

public class Sherlock {

    public static int sumOfChars(char[] checkSumOfChars) {
        int x = 0;
        for (char checkSumOfChar : checkSumOfChars) {
            x += Integer.parseInt(String.valueOf(checkSumOfChar));
        }
        return x;
    }

    public static boolean checkQuantity(int[] numberOfChars) {
        boolean isAllEqual = true;
        for (int i = 0; i < numberOfChars.length; i++) {
            if (numberOfChars[i] != 0 && numberOfChars[0] != numberOfChars[i]) {
                isAllEqual = false;
                break;
            }
        }
        return isAllEqual;
    }


    public static boolean SherlockValidString(String s){
        List<String> withoutDuplicates = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(j) && !withoutDuplicates.contains((String.valueOf(s.charAt(j))))) {
                    withoutDuplicates.add(String.valueOf(s.charAt(j)));
                    break;
                }
            }
        }
        List<String> listOfChars = new ArrayList<>(withoutDuplicates);
        for (int y = 0; y < withoutDuplicates.size(); y++) {
            for (int z = 0; z < s.length(); z++) {
                if (String.valueOf(s.charAt(z)).equals(withoutDuplicates.get(y))) {
                    listOfChars.set(y, listOfChars.get(y)+1);
                }
            }
        }
        char[] checkSumOfChars;
        int[] numberOfChars = new int[listOfChars.size()];
        for (int i = 0; i < listOfChars.size(); i++) {
            listOfChars.set(i, listOfChars.get(i).substring(1));
            checkSumOfChars = listOfChars.get(i).toCharArray();
            numberOfChars[i] = (sumOfChars(checkSumOfChars));
        }

        boolean isValid = true;

        for (int i = 0; i < numberOfChars.length-1; i++) {
            if (numberOfChars[i] != numberOfChars[i + 1]) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            return true;
        }

        // Проверяем, можно ли удалить одну букву, чтобы условие задачи выполнялось
        for (int i = 0; i < numberOfChars.length; i++) {
            numberOfChars[i] -= 1;
            if (!checkQuantity(numberOfChars)) {
                numberOfChars[i] += 1;
            } else {
                return true;
            }
        }

        return isValid;
    }
}


