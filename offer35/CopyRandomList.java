package offer35;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

}


// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


//法一、哈希表法
class Solution1 {
    public Node copyRandomList(Node head) {
        //1、如果原链表head为空，直接返回null
        if (head == null){
            return null;
        }

        //2、声明cur指向头节点；
        //初始化一个哈希表用来建立原链表节点到新链表节点的映射
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();

        //3、遍历原链表，构建新链表的每一个节点；
        //cur指向原链表的下一个节点；
        while (cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        //4、cur重新指向头节点；
        //再次遍历原链表，构建新链表的next引用和random引用；
        //cur指向原链表的下一个节点
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        //5、返回新链表的头节点
        return map.get(head);
    }
}


//法二、拼接法
class Solution2 {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }

        //1、复制各节点，构建拼接链表
        Node cur = head;
        while (cur != null){
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        //2、构建新链表各节点的 random 指向
        cur = head;
        while (cur != null){
            if (cur.random != null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        //3、拆分原 / 新链表
        cur = head.next;
        Node pre = head;
        Node res = head.next;
        while (cur.next != null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;

        //4、返回新链表的头节点 res
        return res;
    }
}