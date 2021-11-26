package com.prolearning.datastructure.treedatastructure;

import java.util.*;

public class BinaryTreePreorderTraversal {
    public static void main(String args[]){
        System.out.println("Binary Tree preorder traversal here...");
        Integer[] inputArray = {1,null,2,3};
        TreeNode node = TreeNode.createTree(inputArray);
        List<Integer> list = preorderTraversal(node);
        System.out.println("Output " + list);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderResult = new ArrayList<>();
        if(root==null)
            return preOrderResult;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            preOrderResult.add((Integer) treeNode.val);

            if(treeNode.right!=null) {
                stack.push(treeNode.right);
            }
            if(treeNode.left!=null) {
                stack.push(treeNode.left);
            }
        }
        return preOrderResult;
    }
}
