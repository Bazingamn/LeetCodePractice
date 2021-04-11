package offer09;

import java.util.Deque;
import java.util.LinkedList;

public class QueueByStack {
    
}

/**
 * 题目描述：用两个栈来表示队列
 * 
 * 思路：两个栈，一个专门用来入栈，一个专门用来出栈。
 * 尾部插入的操作就专门入栈；头部删除的操作用出栈表示
 * @return
 */
class CQueue{

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue(){
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        }else{
            return stack2.pop();
        }
    }
}

