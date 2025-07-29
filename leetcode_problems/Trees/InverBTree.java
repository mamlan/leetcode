
//  226. Invert Binary Tree


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
    public TreeNode invertTree(TreeNode root) {
        /**
        this is a dfs problem
        we swap the children of root and go down the order 

        if !root -> return null
        left = root.left
        right= root.right
        root.left=right
        root.right=left
        invertTree(root.left)
        invertTree(root.right)

        or we can also do:
        left= invertTree(root.left)
        right=invertTree(root.right)
        root.left=root.right
        root.right=root.left
        return root
         */
         if(root==null) return null;
         TreeNode left = invertTree(root.left);
         TreeNode right = invertTree(root.right);
         root.left=right;
         root.right=left;
         
         return root;

    }
}