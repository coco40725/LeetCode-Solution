import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yu-Jing
 * @create 2022-07-29-PM 03:12
 */
public class Soultion {
    public static void main(String[] args) {
        int[] n = new int[]{1,2,3};
        List<Integer> num = new Soultion().majorityElement(n);
        System.out.println(num);
    }

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list  = new ArrayList<>();
        int freq_cutoff = nums.length / 3;

        for (int i = 0; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if (map.get(nums[i]) > freq_cutoff && !list.contains(nums[i])) list.add(nums[i]);
        }

        return list;

    }
}

