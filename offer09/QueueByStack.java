package offer09;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 题目描述：用两个栈来表示队列
 * 
 * 思路：两个栈，一个专门用来入栈，一个专门用来出栈。
 * 尾部插入的操作就专门入栈；头部删除的操作用出栈表示
 * @return
 */
class CQueue{

    Deque<Integer> stack1;  //插入栈
    Deque<Integer> stack2;  //删除栈

    public CQueue(){
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    //专门用来维护插入的栈
    public void appendTail(int value){
        stack1.push(value);
    }

    //专门用来维护删除的栈
    public int deleteHead(){
        if (!stack2.isEmpty()){
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            if (stack2.isEmpty()){
                return -1;
            }else {
                return stack2.pop();
            }
        }
    }
}


public class QueueByStack {
    public static void main(String[] args) {

    }
}
