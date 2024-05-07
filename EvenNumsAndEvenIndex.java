import java.util.*;

public class EvenNumsAndEvenIndex {

    // Печать только четных значений из списка
    public static List<Integer> evenNums(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.getFirst() % 2 == 0) {
            System.out.println(list.getFirst());
        }
        list.remove(list.getFirst());
        return evenNums(list);
    }

    // Печать элементов списка с чётными индексами;
    public static List<String> evenIndex(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        if ((list.size()-1) % 2 == 0) {
            System.out.println(list.getLast());
        }
        list.remove(list.getLast());
        return evenIndex(list);
    }
}


