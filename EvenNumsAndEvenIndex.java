import java.util.*;

public class EvenNumsAndEvenIndex {

    // Печать только четных значений из списка
    public static List<Integer> evenNums(List<Integer> list) {
        List<Integer> nums = new ArrayList<>();
        if (list.isEmpty()) {
            return nums;
        }
        nums.add(list.getLast());
        list.remove(list.getLast());
        evenNums(list);
        if (nums.getLast() % 2 == 0) {
            System.out.println(nums.getLast());
            list.add(nums.getLast());
        }
        return list;
    }

    // Печать элементов списка с чётными индексами;
    public static List<String> evenIndex(List<String> list) {
        List<String> index = new ArrayList<>();
        int count = list.size();
        if (list.isEmpty()) {
            return index;
        }
        index.add(list.getLast());
        list.remove(list.getLast());
        count--;
        evenIndex(list);
        if (count % 2 == 0) {
            System.out.println(index.getLast());
            list.add(index.getLast());
        }
        return list;
    }
}


