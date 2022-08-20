import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Yu-Jing
 * @create 2022-08-18-下午 05:58
 */
public class MyQueue1 {
    Stack<Integer> first = null;
    Stack<Integer> second = null;

    public MyQueue1() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (! second.empty()){
            return second.pop();
        }else{
            while(! first.empty()){
                second.push(first.pop());
            }
            return second.pop();
        }
    }

    public int peek() {
        if (! second.empty()){
            return second.peek();
        }else{
            while(! first.empty()){
                second.push(first.pop());
            }
            return second.peek();
        }

    }

    public boolean empty() {
        return first.empty() && second.empty();

    }
}
