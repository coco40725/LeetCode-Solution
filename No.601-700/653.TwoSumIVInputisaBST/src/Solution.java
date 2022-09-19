import java.util.*;

/**
 * @author Yu-Jing
 * @create 2022-09-19-下午 01:37
 */
public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        // DFS search : iteration
        Stack<TreeNode> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            Integer value = temp.val;

            if (set.contains( k - value)) return true;
            set.add(value);

            if (temp.left != null){
                stack.push(temp.left);
            }

            if (temp.right != null){
                stack.push(temp.right);
            }
        }
        return false;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}