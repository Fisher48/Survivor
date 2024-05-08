import java.util.*;

public class FindSecondMax {


    public static int SecMax(List<Integer> nums, int max1, int max2, int index) {
        if (index > nums.size() - 1) {
            return max2;
        }
        if (nums.get(index) >= max1 && nums.get(index) >= max2) {
            max2 = max1;
            max1 = nums.get(index);
        }
        else if (nums.get(index) > max2 && nums.get(index) <= max1) {
            max2 = nums.get(index);
        }
        return SecMax(nums, max1, max2, index + 1);
    }

    public static int findSecMax(List<Integer> numbs) {
        if (numbs.size() <= 1) {
            return numbs.getFirst();
        }
        int max1 = 0; int max2 = 0;
        if (numbs.get(0) > numbs.get(1)) {
            max1 = numbs.get(0);
            max2 = numbs.get(1);
        } else {
            max2 = numbs.get(0);
            max1 = numbs.get(1);
        }
        return SecMax(numbs, max1, max2, 2);
    }

}


