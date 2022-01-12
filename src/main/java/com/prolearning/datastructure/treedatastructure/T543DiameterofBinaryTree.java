package com.prolearning.datastructure.treedatastructure;

import java.util.Stack;

public class T543DiameterofBinaryTree {
    static int maxWidth = Integer.MIN_VALUE;
    public static void main(String args[]) {
        System.out.println("****************Template**********");
        Integer[] inputArray = {1,2,3,4,5};
        TreeNode root = TreeNode.createTree(inputArray);
        System.out.println("width : " + diameterOfBinaryTree(root));
        System.out.println("****************Template**********");
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        maxWidth = Integer.MIN_VALUE;
        diameterOfBinaryTreeRecursion(root);
        return maxWidth;
    }
    public static int diameterOfBinaryTreeRecursion(TreeNode node) {
        if(node==null)
            return 0;

        int leftHeight = 0, rightHeight = 0, width = 0, height =0;
        if(node.left!=null)
            leftHeight = diameterOfBinaryTreeRecursion(node.left);
        if(node.right!=null)
            rightHeight = diameterOfBinaryTreeRecursion(node.right);
        width = leftHeight+rightHeight;
        maxWidth = Math.max(width, maxWidth);
        height = Math.max(leftHeight, rightHeight)+1;

        System.out.println("val: " + node.val + "----"+ "height: "+height+ "--- width:"+width);
        return height;
    }


}
