package com.prolearning.datastructure.treedatastructure;

public class T236LowestCommonAncestorBinaryTree {
    public static void main(String args[]) {
        System.out.println("****************T236LowestCommonAncestorBinaryTree**********");
        Integer[] inputArray = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = TreeNode.createTree(inputArray);
        System.out.println("****************T236LowestCommonAncestorBinaryTree**********");
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = lowestCommonAncestorRecursive(root, p, q);
        return node;
    }
    public TreeNode lowestCommonAncestorRecursive(TreeNode node, TreeNode p, TreeNode q) {
        if(node==null)
            return null;
        if(node==p || node==q)
            return node;
        TreeNode leftNode = lowestCommonAncestorRecursive(node.left, p, q);
        TreeNode rightNode = lowestCommonAncestorRecursive(node.right, p, q);
        if(leftNode!=null && rightNode!=null)
            return node;
        if(leftNode!=null)
            return leftNode;
        else
            return rightNode;
    }
}
