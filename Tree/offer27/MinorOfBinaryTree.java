package Tree.offer27;

import java.util.Stack;

/**
 * 树的镜像
 * 关于树的操作常与bfs、dfs有关，考虑递归
 */
public class MinorOfBinaryTree {
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 递归
 */
class Solution1 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //暂存root的子节点，因为递归完右子节点后，左子节点已被重新赋值
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}


/**
 * 辅助栈
 */
class Solution2 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left != null){
                stack.add(node.left);
            }
            if (node.right != null){
                stack.add(node.right);
            }
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}