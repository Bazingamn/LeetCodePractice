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
 * 快慢指针
 *
 * 我们可以将链表的后半部分反转（修改链表结构），然后将前半部分和后半部分进行比较。比较完成后我们应该将链表恢复原样。
 * 虽然不需要恢复也能通过测试用例，但是使用该函数的人通常不希望链表结构被更改。
 *
 * 这样可以避免使用O（n）的额外空间
 *
 * 流程：
 * 1、找到前半部分链表的尾节点。
 * 2、反转后半部分链表。
 * 3、判断是否回文。
 * 4、恢复链表。
 * 5、返回结果。
 *
 * 执行步骤一，我们可以计算链表节点的数量，然后遍历链表找到前半部分的尾节点。
 * 我们也可以使用快慢指针在一次遍历中找到：慢指针一次走一步，快指针一次走两步，快慢指针同时出发。当快指针移动到链表的末尾时，慢指针恰好到链表的中间。通过慢指针将链表分为两部分。
 * 若链表有奇数个节点，则中间的节点应该看作是前半部分。
 * 步骤二可以使用「206. 反转链表」问题中的解决方法来反转链表的后半部分。
 * 步骤三比较两个部分的值，当后半部分到达末尾则比较完成，可以忽略计数情况中的中间节点。
 * 步骤四与步骤二使用的函数相同，再反转一次恢复链表本身。
 *
 */
class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }

        // 找到前半部分链表的尾节点并反转后半部分链表
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        //判断是否回文
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while (result && p2!= null){
            if (p1.val != p2.val){
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        //还原链表并返回结果
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    //反转链表
    ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    //找到前半部分链表的尾节点并返回
    private ListNode endOfFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}