class Solution {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftht=height(root.left);
        int rightht=height(root.right);
        int currDia=leftht+rightht;
        diameter=Math.max(diameter,currDia);
        return Math.max(leftht,rightht)+1;
    }
}
