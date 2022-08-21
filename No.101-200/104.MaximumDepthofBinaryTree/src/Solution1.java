import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yu-Jing
 * @create 2022-08-21-下午 03:53
 */
public class Solution1 {
    // BFS version
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++){
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            depth++;
        }
       return depth;
    }
}
