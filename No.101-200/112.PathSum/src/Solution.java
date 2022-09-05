/**
 * @author Yu-Jing
 * @create 2022-09-05-下午 03:51
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return true;
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