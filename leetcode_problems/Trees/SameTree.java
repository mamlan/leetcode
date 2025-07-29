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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null ^ q==null) return false;
        Queue<TreeNode> p1 = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();

        p1.add(p);
        q1.add(q);

        while(!p1.isEmpty() || !q1.isEmpty()){
            if(p1.isEmpty() || q1.isEmpty()) return false;
            TreeNode a = p1.poll();
            TreeNode b = q1.poll();

            if(a==null ^ b==null) return false;
            if(a==null && b==null) continue;
            if(a.val!=b.val) return false;
            p1.add(a.left);
            p1.add(a.right);
            q1.add(b.left);
            q1.add(b.right);
        }

        if(!p1.isEmpty() || !q1.isEmpty()) return false;

        return true;
    }
}
