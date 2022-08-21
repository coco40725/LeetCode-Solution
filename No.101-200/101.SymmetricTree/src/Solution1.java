import com.sun.source.tree.Tree;

/**
 * @author Yu-Jing
 * @create 2022-08-21-下午 04:29
 */
public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        return checkMirror(root.left, root.right);
    }

    public boolean checkMirror(TreeNode leftNode, TreeNode rightNode){
        if (leftNode == null || rightNode == null) return leftNode == rightNode;
        if (leftNode.val != rightNode.val) return false;
        return (checkMirror(leftNode.left, rightNode.right) && checkMirror(leftNode.right, rightNode.left));
    }
}


