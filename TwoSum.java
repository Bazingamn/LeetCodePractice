import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < (new TwoSumSolution2().twosum(nums, target)).length; i++) {
            System.out.println(i);
        }
        
    }
}

/**
 * 暴力枚举
 */
class TwoSumSolution1 {
    public int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    
}

/**
 * 哈希表
 */
class TwoSumSolution2 {
    public int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target-nums[i])) {
                return new int[]{hashtable.get(target-nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}