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
        List<TreeNode> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
    private void bfs(TreeNode root){
       while(!q.isEmpty()){
        TreeNode node = q.poll();
        ans.add(node);
        if(node!=null){

                TreeNode temp = node.left;
        node.left = node.right;
        node.right=temp;
        q.offer(node.left);
        q.offer(node.right);
    
        }
       } 
    }
    public TreeNode invertTree(TreeNode root) {
        q.offer(root);
        bfs(root);
        return ans.get(0);
    }
}