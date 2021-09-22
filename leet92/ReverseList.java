package leet92;

public class ReverseList {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1){

        }
        return null;
    }

    public ListNode reverseN(ListNode head, int n){
        if (n==1){
            
        }
        return null;
    }
}

/**
 * 定义ListNode
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}