/*
Preorder Traversal
root node - left - right, root at the first
*
* */
import java.util.ArrayList;
import java.util.List;


/**
 * @author Yu-Jing
 * @create 2022-08-19-上午 08:25
 */

public class Solution {
    // Recursion  version
  public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      if (root == null)  return list;

      list.add(root.val);
      list.addAll(preorderTraversal(root.left));
      list.addAll(preorderTraversal(root.right));
      return list;


//      if (root.left != null && root.right != null){
//          list.addAll(preorderTraversal(root.left));
//          list.addAll(preorderTraversal(root.right));
//          return list;
//      }else if (root.left != null &&  root.right == null){
//          list.addAll(preorderTraversal(root.left));
//          return list;
//      }else if (root.left == null &&  root.right != null){
//          list.addAll(preorderTraversal(root.right));
//          return list;
//      }else {
//          return list;
//      }

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