import java.util.HashMap;

/**
 * @author Yu-Jing
 * @create ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {


    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(target -  nums[i])) {
                return new int[]{map.get(target -  nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}