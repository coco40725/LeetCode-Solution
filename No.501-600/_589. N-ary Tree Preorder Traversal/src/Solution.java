import java.util.List;

/**
 * @author Yu-Jing
 * @create 2023/2/9 下午 02:10
 */
public class Solution {
    
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};