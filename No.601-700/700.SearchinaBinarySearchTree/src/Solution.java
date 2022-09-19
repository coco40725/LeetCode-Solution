/**
 * @author Yu-Jing
 * @create 2022-09-17-下午 01:56
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // recursion
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }else if (root.val != val && root.right == null  && root.left == null){
            return null;
        }
        return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
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