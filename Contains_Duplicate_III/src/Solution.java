/*
Key point:
(1) we want to make a bucket, such that
       if  num[i] and num[j] would classify into same bucket ,
       then abs(num[i] - nums[j]) <= t.
       Reverse is not true, see (2).

(2) If nums[i] and nums[j] were not in the same bucket, "DO NOT IMPLY" abs(num[i] - nums[j]) > t

(3) Use HashMap build the bucket.
    Key : bucket
    Value :  the elements from int[.]

*/

/*
(1) How to define the bucket? how to classify the element into the bucket ?
step 1 : we need to ensure all the values from nums[.] are "positive"!
step 2 : we could classify the values based on Quotient = nums[.] / (t+1)

concept: we want to make the bucket look like as follows:
int[] = [7,4,5,6,8,9], k = 2, t = 3.
bucket 1 = {4, 5, 6, 7}, the difference between these value are <= 3
bucket 2 = {8,9}, the difference between these value are <= 3



see example 1. int[] = [7,4,5,6,8,9], and k = 2, t = 3
loop 1 :
    bucket 2 = {7}
loop 2:
    bucket 2 = {7}; bucket 1 = {4}
loop 3:
    bucket 2 = {7}; bucket 1 = {4}
    5 should to be classified into bucket 1, and bucket 1 already had value, return true!


(2) Why do we need to ensure all the values from nums[.] are "positive" ?
see example 2. int[] = [-1,0,1,2,3], and k = 2, t = 2
the bucket would be like,
bucket 0 = {-1, 0, 1, 2}, the difference between these value are "NOT" <= 2, because of " (-1) - (2) = -3 "
bucket 1 = {3}

(3)  If nums[i] and nums[j] were not in the same bucket, "DO NOT IMPLY" abs(num[i] - nums[j]) > t
see example 3. int[] = [3,7,4,5,6,8,9], k = 2, t = 3.
bucket 0 = {3}
bucket 1 = {4, 5, 6, 7}, the difference between these value are <= 3
bucket 2 = {8, 9}, the difference between these value are <= 3

As you can see, the difference between 3 (bucket 0) and 4 (bucket 1) is one, even if they are not in the same bucket.
So if we cannot found the spefic bucket, we need to check the nearest bucket  exists or not and also check the difference.

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author Yu-Jing
 * @create 2022-08-03-PM 02:38
 */
public class Solution {
    public static void main(String[] args) {
        int[] num = new int[]{4,7,5,6,8,9};
       boolean bo = new Solution().containsNearbyAlmostDuplicate(num,2,3);
        System.out.println(bo);
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {


        if (nums == null || nums.length < 2 || k < 1) return false;
        HashMap<Long, Long> Map = new HashMap<>();
        long busketSize = (long) t + 1;

        for (int i = 0;  i < nums.length; i++){


            // step 1: move the window and remove the oldest bucket
            if (i > k) {
                long firstBucket = ((long) nums[i - k - 1] - Integer.MIN_VALUE) / busketSize;
                Map.remove(firstBucket);
            }


            // step 2: make the Integer value be positive
            long newNum = (long) nums[i] - Integer.MIN_VALUE;

            // step 3: find the bucket (key)
            long bucket = newNum / busketSize;

            // step 4:  if the bucket is exist then abs(num[i] - nums[j]) <= t.
            if (Map.containsKey(bucket)) return true;

            // step 5: if the bucket is not exist, then find the nearest bucket (bucket - 1 and bucket + 1) and check the abs(num[i] - nums[j])
            if (Map.containsKey(bucket + 1) && Math.abs( Map.get(bucket + 1) - nums[i] ) <= t) return true;
            if (Map.containsKey(bucket - 1) && Math.abs( Map.get(bucket - 1) - nums[i] ) <= t) return true;

            // step 6: add the value into bucket
            Map.put(bucket, (long) nums[i]);

        }
        return false;

    }

}

