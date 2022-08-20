import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-07-28-PM 03:53
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Method1 : two pointer solution
        // 0. define the list
        List< List<Integer> > list = new ArrayList<>();

        // 1. Sort arrays
        Arrays.sort(nums);

        // 2. define lower pointer, upper pointer, sum
        int lower, upper, sum;

        // 3. for-loop : screen
        for (int i = 0; i < nums.length - 2; i++){
            lower = i + 1;
            upper = nums.length - 1;
            // 4. while-loop : find answer + update lower/upper pointer
            while(lower < upper) {
                sum = nums[i] + nums[lower] + nums[upper];
                if (sum == 0){
                    list.add(List.of(nums[i],nums[lower], nums[upper]));
                    lower++;
                    while (lower < upper && nums[lower] == nums[lower - 1] ) lower++;

                } else if ( sum < 0){
                    lower++;
                    while (lower < upper && nums[lower] == nums[lower - 1] ) lower++;
                } else {
                    upper--;
                    while (lower < upper && nums[upper] == nums[upper -1 ] ) upper--;
                }
            }

        }
        return  list;

    }
}
