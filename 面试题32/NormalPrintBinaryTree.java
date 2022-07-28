package 面试题32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NormalPrintBinaryTree {

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * BFS，广度优先搜索，根据特性通常使用队列
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            arrayList.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
