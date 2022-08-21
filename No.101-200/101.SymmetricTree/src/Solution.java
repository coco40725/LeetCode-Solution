import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Yu-Jing
 * @create 2022-08-21-下午 04:07
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // BFS version

        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < queueSize; i++){
                TreeNode node = queue.poll();
                if (node == null) {
                    subList.add(null);
                }else{
                    subList.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }

            }

            // check the list is mirror or not
            if (subList.size() % 2 == 0){
                for (int j = 0, k = subList.size() - 1; j < k; j++, k--){
                    if (subList.get(j) != (subList.get(k))) return false;
                }
            }else if (subList.size() != 1){
                return false;
            }

        }
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