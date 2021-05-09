package offer30;

import java.util.Stack;

public class StackInclueMin {
    public static void main(String[] args) {
        
    }
}

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
class MinStack {

    Stack<Integer> A;
    Stack<Integer> B;

    /** initialize your data structure here. */
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    
    public void push(int x) {
        A.add(x);
        if (B.empty() || x <= B.peek()) {
            B.add(x);
        }
    }
    
    public void pop() {
        Integer m = A.pop();
        if (m.equals(B.peek())) {
            B.pop();
        }
    }
    
    public int top() {
        return A.peek();
    }
    
    public int min() {
        return B.peek();
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