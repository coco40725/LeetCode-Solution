

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-19-下午 03:43
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();




        return list;

    }
    public  List<Integer> collectRootValue(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root.left != null)   list.add(root.left.val);
        if (root.right != null) list.add(root.right.val);
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