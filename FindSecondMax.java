import java.util.*;

public class FindSecondMax {

    public static boolean check(List<Integer> matrix) {
        Integer[] arr = matrix.toArray(new Integer[0]);
        Arrays.sort(arr, Collections.reverseOrder());
        List<Integer> list = new ArrayList<>(List.of(arr));
        return list.equals(matrix);
    }

    public static int SecMax(List<Integer> arr, int count) {
        int max = 0;
        int temp = 0;
        if (count == arr.size()-1) {
            count = 0;
        }
        if (arr.get(count) <= arr.get(count+1)) {
            temp = arr.get(count);
            max = arr.get(count+1);
            arr.set(count,max);
            arr.set(count+1,temp);
        }
        count++;
        if (check(arr)) {
            return arr.get(1);
        }
        return SecMax(arr, count);
    }

    public static int findSecMax(List<Integer> numbs) {
        if (numbs.size() == 1) {
            return numbs.getFirst();
        }
        return SecMax(numbs,0);
    }
}


