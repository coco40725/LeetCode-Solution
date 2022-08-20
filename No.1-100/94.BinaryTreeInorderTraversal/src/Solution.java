/*
Inorder Traversal
left  - root node - right, root at the middle
*
*
* */




import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-19-下午 01:26
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        if (root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;

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

