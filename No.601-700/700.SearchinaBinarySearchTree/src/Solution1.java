import java.util.Stack;

/**
 * @author Yu-Jing
 * @create 2022-09-17-下午 02:07
 */
public class Solution1 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        // DFS
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if (temp.val == val) return temp;

            if (temp.left != null) {
                stack.push(temp.left);
            }

            if (temp.right != null){
                stack.push(temp.right);
            }
        }

        return null;
    }
}
