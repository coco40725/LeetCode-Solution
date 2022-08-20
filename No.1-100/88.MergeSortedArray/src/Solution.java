import java.util.Arrays;

/**
 * @author Yu-Jing
 * @create 2022-08-10-PM 01:47
 */
public class Solution {
    public static void main(String[] args) {
        int[] n1 = new int[]{0};
        int[] n2 = new int[]{1};
        Solution s = new Solution();
        s.merge(n1,0,n2,1);
        System.out.println(Arrays.toString(n1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m !=  0 && n != 0) {
            int[] tmp = Arrays.copyOf(nums1,m);
            int i = 0;
            int j = 0;
            boolean flag1 = true;
            boolean flag2 = true;

            for (int k = 0; k < nums1.length ; k ++){
                if ( (tmp[i] <= nums2[j] && flag1) || !flag2) {
                    nums1[k] = tmp[i];
                    i++;
                    if (i >= m) {
                        flag1 = false;
                        i = m - 1;
                    }
                    continue;
                }

                if ( (tmp[i] >= nums2[j] && flag2) || !flag1){
                    nums1[k] = nums2[j];
                    j++;
                    if (j >= n)  {
                        flag2 = false;
                        j = n - 1;
                    }
                    continue;
                }
            }
        }

        if (m == 0){
            for (int i = 0; i < n ; i ++){
                nums1[i] = nums2[i];
            }
        }
    }
}
