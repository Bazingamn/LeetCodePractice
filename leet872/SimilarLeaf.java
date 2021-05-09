package leet872;

import java.util.List;

public class SimilarLeaf {
    public static void main(String[] args) {

    }
}


/**
 * 定义二叉树
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 * 深度优先搜索
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return false;
    }

    public void dfs(TreeNode node, List<Integer> seq){

    }
}
