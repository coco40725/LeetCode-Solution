/*
void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
*
* */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-08-18-下午 05:51
 */
public class MyQueue {
    List<Integer> list = null;

    public MyQueue() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int value = list.get(0);
        list.remove(0);
        return value;
    }

    public int peek() {
        return list.get(0);
    }

    public boolean empty() {
        if (list == null || list.size() == 0) {
            return true;
        }else{
            return false;
        }

    }
}
