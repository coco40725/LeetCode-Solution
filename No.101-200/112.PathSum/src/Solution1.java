import com.sun.source.tree.Tree;

import java.util.Stack;

/**
 * @author Yu-Jing
 * @create 2022-09-17-下午 01:33
 */
public class Solution1 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stack_sum = new Stack<>();

        stack.push(root);
        stack_sum.push(root.val);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            Integer sub_sum = stack_sum.pop();
            if (temp.right == null && temp.left == null){
                if (sub_sum == targetSum ) return true;
            }else{
                if (temp.left != null){
                    stack.push(temp.left);
                    stack_sum.push(sub_sum + temp.left.val);
                }

                if (temp.right != null){
                    stack.push(temp.right);
                    stack_sum.push(sub_sum + temp.right.val);
                }
            }

        }
        return false;
    }
}

