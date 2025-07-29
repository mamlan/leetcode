//  623. Add One Row to Tree

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        //depth starts at 1
        //we need to track parent
        //dfs makes sense here
        //need to track if left or right subtree
        if(root==null || depth==0) return root;
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left=root;
            return node;
        }
        if(depth==2){
            TreeNode node = new TreeNode(val);
            TreeNode node2 = new TreeNode(val);
            node.left=root.left;
            node2.right=root.right;
            root.left=node;
            root.right=node2;
            return root;
        }
        addOneRow(root.left, val, depth-1);
        addOneRow(root.right, val, depth-1);
        return root;
    }
}