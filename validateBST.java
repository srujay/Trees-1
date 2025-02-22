
//Time Complexity: O(n )
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return false;
        Stack<TreeNode> s = new Stack<>();
        TreeNode prev = null;
        while(root != null || !s.isEmpty()){
            while(root != null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();

            if(prev != null && prev.val >= root.val)
                return false;

            prev = root;
            root = root.right;
        }
        return true;
    }
}
