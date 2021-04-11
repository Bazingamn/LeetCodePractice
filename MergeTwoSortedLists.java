public class MergeTwoSortedLists {
    public static void main(String[] args) {
        
    }
}


class ListNode21 {
    int val;
    ListNode21 next;
    ListNode21() {

    }
    ListNode21(int val) { 
        this.val = val; 
    }
    ListNode21(int val, ListNode21 next) { 
        this.val = val; 
        this.next = next; 
    }
}


class Solution21{
    public ListNode21 mergeTwoList(ListNode21 L1, ListNode21 L2){
        if (L1 == null) {
            return L2;
        }else if (L2 == null) {
            return L1;
        }else if(L1.val < L2.val){
            L1.next = mergeTwoList(L1.next, L2);
            return L1;
        }else{
            L2.next = mergeTwoList(L1, L2.next);
            return L2;
        }
    }
}