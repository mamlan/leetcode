//  102. Binary Tree Level Order Traversal

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        // [9,20]
        q.offer(root);
        // lvl.add(root.val);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                if(n==null) continue;
                list.add(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            if(list.size()==0) continue;
            res.add(list);
        }
        return res;
    }
}