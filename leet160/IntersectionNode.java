package leet160;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 */
public class IntersectionNode {
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
   }
}

/**
 * 哈希集合法
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //创建一个哈希集合存储链表A的所有节点
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if (visited.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}

/**
 * 双指针法
 */
class solution2{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //首先，两个链表如果都为空，则肯定不相交，返回null
        if (headA == null || headB == null){
            return null;
        }

        //两个链表都不为空时的判断
        //创建两个指针分别指向A、B的头结点，然后将两个指针依次遍历两个链表的每个节点
        ListNode PA = headA;
        ListNode PB = headB;

        while (PA != PB){
            PA = PA == null ? headB : PA.next;
            PB = PB == null ? headA : PB.next;
        }

        return PA;
    }
}
