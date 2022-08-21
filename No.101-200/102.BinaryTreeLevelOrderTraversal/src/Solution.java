import com.sun.source.tree.Tree;

import java.util.*;

/*
* Stack : Last in first out (LIFO)
* Queue: First in first out (FIFO)
*
* Queue method:
*  1. add 、 offer (Throws Exception) : Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
*  2. poll、 remove (Throws Exception) : Retrieves and removes the head of this queue.
*  3. peek、 element (Throws Exception) : Retrieves, but does not remove, the head of this queue.
*
* BFS and DFS example: https://magiclen.org/dfs-bfs/
* BFS, use Queue; https://mycollegenotebook.medium.com/%E5%9C%96%E7%9A%84%E8%B5%B0%E8%A8%AA-bfs-dfs-2-a5dd4b7bd701
* DFS, use Stack. https://mycollegenotebook.medium.com/%E5%9C%96%E7%9A%84%E8%B5%B0%E8%A8%AA-bfs-dfs-1-8a635ea89013
*
* */

import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-19-下午 03:43
 */
public class Solution {
    // BFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        // we will use queue to record the all nodes at ith level
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        // while loop: up to down
        while(!queue.isEmpty()){
            // for loop: scan the all nodes at ith level
            // subList will record the values of all nodes at ith level
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                subList.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(subList);
        }
        return result;

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