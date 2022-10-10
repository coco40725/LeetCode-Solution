/*
Collections.sort() vs Arrays.sort()
*  https://stackoverflow.com/questions/52714131/why-is-collections-sort-much-slower-than-arrays-sort
 So, there are two different methods with totally different algorithms here:

 - Arrays.sort(int[]) uses a dual-pivot quicksort algorithm.

 - Collections.sort(List<T>) calls list.sort(null) which in turn calls Arrays.sort(T[]). This uses a Timsort algorithm.

So, let's compare Arrays.sort(int[]) and Arrays.sort(T[]).

1. T[] is a boxed array so there is one extra level of indirection: for each call, you have to unwrap Integer. This certainly leads to an overhead.
On the other hand, int[] is a primitive array so all elements are available "immediately".
2. TimSort is a variation of a classic mergesort algorithm. It is faster than mergesort but it still slower than quicksort because
    - quicksort has fewer data movements on random data
    - quicksort requires O(log(n)) extra space while TimSort requires O(n) to provide stability which also leads to an overhead.
 * */

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/**
 * @author Yu-Jing
 * @create 2022-09-19-下午 03:11
 */
public class Solution {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1,4},{4,5}};
        Solution s = new Solution();
        int[][] merge = s.merge(test);
        for(int i = 0; i < merge.length ; i++){
            System.out.println(Arrays.toString(merge[i]));
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1 ) return intervals;
        if (intervals == null) return  null;


        // 1. sort the int[statri, endi] based on the start
        Comparator<int[]> comparator = (o1,o2) -> Integer.compare(o1[0],o2[0]);

//       Comparator<int[]> comparator = new Comparator<int[]>() {
//           @Override
//           public int compare(int[] o1, int[] o2) {
//               return Integer.compare(o1[0], o2[0]);
//           }
//       };

        Arrays.sort(intervals, comparator);


        // 2. rule: [s1, e1] [s2, e2] ; if s2 > s1 && s2 < e1 -- > merge [s1,e2]
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < intervals.length ; i++){
             if (i < intervals.length - 1 && intervals[i + 1][0] >= intervals[i][0] && intervals[i + 1][0] <= intervals[i][1]) {
                 intervals[i + 1][0] = intervals[i][0];
                if (intervals[i][1] > intervals[i + 1][1]) {
                    intervals[i + 1][1] = intervals[i][1];
                }else{
                    intervals[i][1] = intervals[i + 1][1];
                }
             }else{
                 list.add(intervals[i]);
             }
        }
        return list.toArray(int[][]::new);

    }


}

