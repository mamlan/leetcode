
// 117. Populating Next Right Pointers in Each Node II

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
                //node.right=parent.right
        //figure out how to iterate -> bfs based on the ordering
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        // [4,5] size=2 n=2 n2=3
        while(!q.isEmpty()){
            int size=q.size();
            Node n = q.poll();
            if(n==null) continue;
            if(n.left!=null) q.offer(n.left);
            if(n.right!=null) q.offer(n.right);
            for(int i=0;i<size-1;i++){
                Node n2 = q.poll();
                if(n2==null) continue;
                if(n2.left!=null) q.offer(n2.left);
                if(n2.right!=null) q.offer(n2.right);
                n.next= n2;
                n=n2;
            }
        }
        return root;
    }
}