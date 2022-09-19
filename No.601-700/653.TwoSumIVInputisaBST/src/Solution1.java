import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author Yu-Jing
 * @create 2022-09-19-下午 01:51
 */
public class Solution1 {
    // DFS search : recursion
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains( k - root.val)) return true;
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
