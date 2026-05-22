class Solution {
    public int height(TreeNode root){
        if(root== null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftht=height(root.left);
        int rightht=height(root.right);
        if(Math.abs(leftht-rightht)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
