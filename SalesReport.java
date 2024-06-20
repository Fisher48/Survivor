import java.util.*;

public class Level1 {

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

        String[] groupedSalesSummary = new String[listOfItems.size()];
        for (int i = 0; i < listOfItems.size(); i++) {
            groupedSalesSummary[i] = listOfItems.get(i);
            groupedSalesSummary[i] += " " + numbOfSoldPieces.get(i);
        }

        int maxV = 0;
        String maxS = "";
        int tempV = 0;
        String tempS = "";
        for (int i = 0; i < groupedSalesSummary.length; i++) {
            for (int j = i; j < groupedSalesSummary.length; j++) {
                if (numbOfSoldPieces.get(i).equals(numbOfSoldPieces.get(j)) && (listOfItems.get(i).compareTo(listOfItems.get(j)) > 0)) {
                    maxV = numbOfSoldPieces.get(j);
                    tempV = numbOfSoldPieces.get(i);
                    maxS = listOfItems.get(j);
                    tempS = listOfItems.get(i);
                    numbOfSoldPieces.set(i, maxV);
                    numbOfSoldPieces.set(j, tempV);
                    listOfItems.set(i, maxS);
                    listOfItems.set(j, tempS);
                }
                if (numbOfSoldPieces.get(i) < numbOfSoldPieces.get(j)) {
                    maxV = numbOfSoldPieces.get(j);
                    tempV = numbOfSoldPieces.get(i);
                    maxS = listOfItems.get(j);
                    tempS = listOfItems.get(i);
                    numbOfSoldPieces.set(i, maxV);
                    numbOfSoldPieces.set(j, tempV);
                    listOfItems.set(i, maxS);
                    listOfItems.set(j, tempS);
                }
            }
        }
        for (int i = 0; i < listOfItems.size(); i++) {
            groupedSalesSummary[i] = listOfItems.get(i);
            groupedSalesSummary[i] += " " + numbOfSoldPieces.get(i);
        }
        return groupedSalesSummary;
    }
}


