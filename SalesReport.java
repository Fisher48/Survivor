import java.util.*;

public class SalesReport {

    public static String[] setGroupingSales(List<String> listOfItems,List<Integer> numbOfSoldPieces){
        String[] groupedSalesSummary = new String[listOfItems.size()];
        for (int i = 0; i < listOfItems.size(); i++) {
            groupedSalesSummary[i] = listOfItems.get(i);
            groupedSalesSummary[i] += " " + numbOfSoldPieces.get(i);
        }
        return groupedSalesSummary;
    }

    public static String [] ShopOLAP(int N, String [] items) {
        String item = "";
        List<String> listOfItems = new ArrayList<>();
        List<Integer> numbOfSoldPieces = new ArrayList<>();
        Arrays.sort(items);
        for (int k = 0; k < N; k++) {
            item = items[k];
            for (int i = 0; i < item.length(); i++) {
                if (item.charAt(i) == ' ') {
                    listOfItems.add(item.substring(0, i));
                    numbOfSoldPieces.add(Integer.valueOf(item.substring(i + 1)));
                }
            }
        }

        int countOfItems = 0;
        while (countOfItems < N - 1) {
            if (listOfItems.get(countOfItems).equals(listOfItems.get(countOfItems + 1))) {
                numbOfSoldPieces.set(countOfItems, numbOfSoldPieces.get(countOfItems) + numbOfSoldPieces.get(countOfItems + 1));
                listOfItems.remove(countOfItems + 1);
                numbOfSoldPieces.remove(countOfItems + 1);
                N--;
                countOfItems--;
            }
            countOfItems++;
        }

        String[] groupedSalesSummary = setGroupingSales(listOfItems,numbOfSoldPieces);
        int itemValueMax = 0;
        String itemNameMax = "";
        int tempValue = 0;
        String tempItem = "";
        for (int i = 0; i < groupedSalesSummary.length; i++) {
            for (int j = i; j < groupedSalesSummary.length; j++) {
                if (numbOfSoldPieces.get(i).equals(numbOfSoldPieces.get(j)) && (listOfItems.get(i).compareTo(listOfItems.get(j)) > 0)) {
                    itemValueMax = numbOfSoldPieces.get(j);
                    tempValue = numbOfSoldPieces.get(i);
                    itemNameMax = listOfItems.get(j);
                    tempItem = listOfItems.get(i);
                    numbOfSoldPieces.set(i, itemValueMax);
                    numbOfSoldPieces.set(j, tempValue);
                    listOfItems.set(i, itemNameMax);
                    listOfItems.set(j, tempItem);
                }
                if (numbOfSoldPieces.get(i) < numbOfSoldPieces.get(j)) {
                    itemValueMax = numbOfSoldPieces.get(j);
                    tempValue = numbOfSoldPieces.get(i);
                    itemNameMax = listOfItems.get(j);
                    tempItem = listOfItems.get(i);
                    numbOfSoldPieces.set(i, itemValueMax);
                    numbOfSoldPieces.set(j, tempValue);
                    listOfItems.set(i, itemNameMax);
                    listOfItems.set(j, tempItem);
                }
            }
        }
        return setGroupingSales(listOfItems,numbOfSoldPieces);
    }
}


