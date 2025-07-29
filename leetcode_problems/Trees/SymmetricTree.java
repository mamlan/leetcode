import javax.swing.tree.TreeNode;

public /**
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
    public boolean isSymmetric(TreeNode root) {
        /**
        lets pick a sorting alg: dfs
        we need to make sure left and right sides are both same
         */
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode l, TreeNode r){
        if(l!=null ^ r!=null) return false;
        if(l==null && r==null) return true;
        if(l.val!=r.val) return false;
        return helper(l.left, r.right) && helper(l.right, r.left);
    }
} {
    
}
