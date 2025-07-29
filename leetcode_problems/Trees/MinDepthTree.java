// 111. Minimum Depth of Binary Tree (easy)



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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null & root.right==null) return 1;
        if(root.left==null) return 1+ minDepth(root.right);
        if(root.right==null) return 1+ minDepth(root.left);
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}

// U: find shortest depth path
// M: tree-> dfs
// P-> we have to measure every path and return the smallest path
    // helper(node, value, min):
    // if node == null return min(min, value)
    // helper(node.left, value+1, min)
    // helper(node.right, value+1, min)
    