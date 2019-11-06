package No700_SearchBST;

import java.util.concurrent.LinkedBlockingQueue;
 
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = null;
        if(root == null){
            return null;
        }
        LinkedBlockingQueue<TreeNode> q = new LinkedBlockingQueue<>();
        q.offer(root);
        while(!q.isEmpty()){
            if(q.peek().val == val){
                return q.peek();
            }
            if(q.peek().left != null){
                q.offer(q.peek().left);
            }
            if(q.peek().right != null){
                q.offer(q.peek().right);
            }
            q.poll();
        }
        return result;
    }
}
