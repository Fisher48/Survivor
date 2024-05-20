import java.util.*;

public class MassDriver {

    public static int massdriver(int[] activate) {
        int count = -1;
        LinkedHashMap<Integer,Integer> list = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> index = new LinkedHashMap<>();
        for (int i = 0; i < activate.length; i++) {
            list.put(activate[i], list.getOrDefault(activate[i],0) + 1);
            if (list.get(activate[i]) > 1) {
                if (index.get(activate[i]) == 0) {
                    return index.get(activate[i]);
                }
                if (index.get(activate[i]) <= count || count == -1) {
                    count = index.get(activate[i]);
                }
            }
            index.put(activate[i],i);
        }
        return count;
    }
}


