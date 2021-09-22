package LinkedList.leet234;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * 输入：head = [1,2,2,1]
 * 输出：true
 *
 * 输入：head = [1,2]
 * 输出：false
 */
public class IsPalindrome {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(10);
        l1.next = l2;
        l2.next = l3;

        System.out.println(new Solution1().isPalindrome(l1));
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


/**
 * 双指针法
 * 时间复杂度O（n）
 * 空间复杂度O（n）
 */
class Solution1 {
    public boolean isPalindrome(ListNode head) {
        //1、将链表中的值复制到数组中
        List<Integer> vals = new ArrayList<Integer>();
        ListNode currentNode = head;
        while (currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //2、对数组使用双指针进行遍历，分别从头和尾进行遍历，来判断是否相等满足回文
        int front = 0;
        int back = vals.size() - 1;
        while (front < back){
            if (!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}


/**
 * 递归
 */
class Solution2 {
    public boolean isPalindrome(ListNode head) {

    }
}