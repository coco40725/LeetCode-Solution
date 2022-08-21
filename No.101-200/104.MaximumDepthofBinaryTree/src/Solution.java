import java.util.Stack;

/**
 * @author Yu-Jing
 * @create 2022-08-21-下午 03:17
 */
public class Solution {
    // Recursion
    public int maxDepth(TreeNode root) {

        return root == null ? 0 : Math.max(maxDepth(root.right),maxDepth(root.left) ) + 1;
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