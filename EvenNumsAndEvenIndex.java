import java.util.*;

public class EvenNumsAndEvenIndex {

    public static List<Integer> printEvenNumbers(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.getFirst() % 2 == 0) {
            System.out.println(list.getFirst());
        }
        list.remove(list.getFirst());
        return printEvenNumbers(list);
    }

    public static List<String> printEvenIndElements(List<String> list, int index) {
        if (index > list.size()-1) {
            return null;
        }
        System.out.println(list.get(index));
        return printEvenIndElements(list, index + 2);
    }
}


