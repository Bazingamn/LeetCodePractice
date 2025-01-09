import java.util.HashMap;
import java.util.Map;

public class SplitArray {
    public static boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums));
    }
}
