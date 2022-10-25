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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        printRSV(root, result, 0); 
        return result;
    }
    public void printRSV(TreeNode cur, List<Integer> result, int level){
        if(cur == null) return ;
        if(level == result.size()){
            result.add(cur.val); // fill the array from backside
        }
        printRSV(cur.right,result,level+1);
        printRSV(cur.left,result,level+1); 
    }
}
