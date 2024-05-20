import java.util.*;

public class MassDriver {

    public static int massdriver(int[] activate){
        int numb = -1;
        int count = 0;
        boolean change = false;
        LinkedHashMap<Integer,Integer> list = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> index = new LinkedHashMap<>();
        for (int i = 0; i < activate.length; i++) {
            list.put(activate[i], list.getOrDefault(activate[i],0) + 1);
            if (list.get(activate[i]) > 1) {
                if (index.get(activate[i]) == 0) {
                    return index.get(activate[i]);
                }
                if (index.get(activate[i]) <= count || count == 0) {
                    count = index.get(activate[i]);
                    change = true;
                }
            }
            index.put(activate[i],i);
        }
        if (!change) {
            return numb;
        } else {
            return count;
        }
    }
}


