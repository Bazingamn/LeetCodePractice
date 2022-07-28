package offer30;

import java.util.Deque;
import java.util.LinkedList;

class MinStack {

    Deque<Integer> stack;
    Deque<Integer> min_stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<Integer>();
        min_stack = new LinkedList<Integer>();
        min_stack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        min_stack.push(Math.min(min_stack.peek(), x));
    }

    public void pop() {
        stack.pop();
        min_stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

public class StackInclueMin {
}