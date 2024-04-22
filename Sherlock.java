import java.util.*;

public class Level1 {

    public static int sumOfChars(char[] check) {
        int x = 0;
        for (int i = 0; i < check.length; i++) {
            x += Integer.parseInt(String.valueOf(check[i]));
        }
        return x;
    }

    public static boolean checkQuantity(int[] num) {
        boolean check = true;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                temp.add(num[i]);
            }
        }
        for (int j = 0; j < temp.size()-1; j++) {
            if (!temp.get(j).equals(temp.get(j+1))) {
                check = false;
                break;
            }
        }

        return check;
    }


    public static boolean SherlockValidString(String s){
        char[] x = s.toCharArray();
        List<String> list = new ArrayList<>();
        List<String> withoutDuplicates = new ArrayList<>();
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] == x[j] && !withoutDuplicates.contains((String.valueOf(x[j])))) {
                    withoutDuplicates.add(String.valueOf(x[j]));
                    break;
                }
            }
        }
        list.addAll(withoutDuplicates);
        for (int y = 0; y < withoutDuplicates.size(); y++) {
            for (int z = 0; z < x.length; z++) {
                if (String.valueOf(x[z]).equals(withoutDuplicates.get(y))) {
                    list.set(y, list.get(y)+1);
                }
            }
        }
        char[] check;
        int[] num = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).substring(1));
            check = list.get(i).toCharArray();
            num[i] = (sumOfChars(check));
        }

        boolean checkChars = true;

        for (int i = 0; i < num.length-1; i++) {
            if (num[i] != num[i + 1]) {
                checkChars = false;
                break;
            }
        }

        if (checkChars) {
            return true;
        }

        for (int i = 0; i < num.length; i++) {
            num[i] -= 1;
            if (!checkQuantity(num)) {
                num[i] += 1;
            } else {
                return true;
            }
        }

        return checkChars;
    }
}


