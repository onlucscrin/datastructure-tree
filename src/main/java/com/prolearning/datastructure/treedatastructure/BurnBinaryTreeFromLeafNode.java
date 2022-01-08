package com.prolearning.datastructure.treedatastructure;

public class BurnBinaryTreeFromLeafNode {
    int maxDistance = Integer.MIN_VALUE;
    public static void main(String args[]) {
        System.out.println("****************Template**********");
        Integer[] inputArray = {1,null,2,3};
        TreeNode root = TreeNode.createTree(inputArray);
        System.out.println("****************Template**********");
    }
    public static int burnTree(TreeNode root, int leaf){
        if(root==null)
            return 0;
//        if(root.val==leaf)
//            return
        return 1;
    }
}
