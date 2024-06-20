import java.util.*;

public class MassDriver {

    public static int massdriver(int[] activate) {
        int count = -1;
        LinkedHashMap<Integer,Integer> listOfValues = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> indexOfValues = new LinkedHashMap<>();
        for (int i = 0; i < activate.length; i++) {
            listOfValues.put(activate[i], listOfValues.getOrDefault(activate[i],0) + 1);
            if (listOfValues.get(activate[i]) > 1) {
                if (indexOfValues.get(activate[i]) == 0) {
                    return indexOfValues.get(activate[i]);
                }
                if (indexOfValues.get(activate[i]) <= count || count == -1) {
                    count = indexOfValues.get(activate[i]);
                }
            }
            indexOfValues.put(activate[i],i);
        }
        return count;
    }
}


