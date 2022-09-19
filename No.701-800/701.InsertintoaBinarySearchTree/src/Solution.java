/**
 * @author Yu-Jing
 * @create 2022-09-17-下午 02:13
 */
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // recursion
        if (root == null) return new TreeNode(val);

        if (val > root.val) {
            if (root.right == null) root.right = new TreeNode(val);
            insertIntoBST(root.right, val);
        }

        if (val < root.val) {
            if (root.left == null)  root.left = new TreeNode(val);
            insertIntoBST(root.left, val);
        }
        return root;

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