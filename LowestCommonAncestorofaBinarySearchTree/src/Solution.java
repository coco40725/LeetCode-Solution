import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-12-PM 03:59
 */
public class Solution {
    public TreeNode1 lowestCommonAncestor(TreeNode1 root, TreeNode1 p, TreeNode1 q) {
        List<TreeNode1> pathP = new ArrayList<>();
        List<TreeNode1> pathQ = new ArrayList<>();
        TreeNode1 LCA = null;
        pathP.add(root);
        pathQ.add(root);

        // 1. Find p, and record the path
        while(true){
            TreeNode1 nodeP = pathP.get(pathP.size() - 1);
            if (p.val > nodeP.val){
                pathP.add(nodeP.right);
            }else if (p.val < nodeP.val){
                pathP.add(nodeP.left);
            }else {
                pathP.add(nodeP);
                break;
            }
        }

        // 2. Find q, and record the path
        while(true){
            TreeNode1 nodeQ = pathQ.get(pathQ.size() - 1);
            if (q.val > nodeQ.val){
                pathQ.add(nodeQ.right);
            }else if (q.val < nodeQ.val){
                pathQ.add(nodeQ.left);
            }else {
                pathQ.add(nodeQ);
                break;
            }
        }

        // compare these two paths
        for (int i = 0; i < Math.min(pathQ.size(),pathP.size()); i++){
            if (pathQ.get(i).val == pathP.get(i).val) {
                LCA = pathQ.get(i);
            }
        }
        return LCA;

    }
}



class TreeNode1 {
     int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode1(int x) { val = x; }
 }

