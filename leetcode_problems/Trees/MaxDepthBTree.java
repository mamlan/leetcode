// 104. Maximum Depth of Binary Tree (Easy)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode root, Integer lvl){
        if(root==null) return lvl;
        int left = helper(root.left, lvl+1);
        int right =helper(root.right, lvl+1);
        return Math.max(left, right);
    }
}