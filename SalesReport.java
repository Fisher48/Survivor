import java.util.*;

public class Level1 {

    public static String [] ShopOLAP(int N, String [] items) {
        String temp = "";
        List<String> listOfItems = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        Arrays.sort(items);
        for (int k = 0; k < N; k++) {
            temp = items[k];
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == ' ') {
                    listOfItems.add(temp.substring(0, i));
                    values.add(Integer.valueOf(temp.substring(i + 1)));
                }
            }
        }

        int x = 0;
        while (x < N - 1) {
            if (listOfItems.get(x).equals(listOfItems.get(x + 1))) {
                values.set(x, values.get(x) + values.get(x + 1));
                listOfItems.remove(x + 1);
                values.remove(x + 1);
                N--;
                x--;
            }
            x++;
        }

        String[] sorted = new String[listOfItems.size()];
        for (int i = 0; i < listOfItems.size(); i++) {
            sorted[i] = listOfItems.get(i);
            sorted[i] += " " + values.get(i);
        }

        int maxV = 0;
        String maxS = "";
        int tempV = 0;
        String tempS = "";
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i; j < sorted.length; j++) {
                if (values.get(i).equals(values.get(j)) && (listOfItems.get(i).compareTo(listOfItems.get(j)) > 0)) {
                    maxV = values.get(j);
                    tempV = values.get(i);
                    maxS = listOfItems.get(j);
                    tempS = listOfItems.get(i);
                    values.set(i, maxV);
                    values.set(j, tempV);
                    listOfItems.set(i, maxS);
                    listOfItems.set(j, tempS);
                }
                if (values.get(i) < values.get(j)) {
                    maxV = values.get(j);
                    tempV = values.get(i);
                    maxS = listOfItems.get(j);
                    tempS = listOfItems.get(i);
                    values.set(i, maxV);
                    values.set(j, tempV);
                    listOfItems.set(i, maxS);
                    listOfItems.set(j, tempS);
                }
            }
        }
        for (int i = 0; i < listOfItems.size(); i++) {
            sorted[i] = listOfItems.get(i);
            sorted[i] += " " + values.get(i);
        }
        return sorted;
    }
}


