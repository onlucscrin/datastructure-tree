package com.prolearning.datastructure.treedatastructure;

import java.util.Stack;

public class T222CountCompleteTreeNodes {
    public static void main(String args[]){
        System.out.println("****************************T222CountCompleteTreeNodes********************");
        System.out.println("****************************T222CountCompleteTreeNodes********************");
    }
    public static int countNodes(TreeNode root) {
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            if(treeNode.right!=null)
                stack.push(treeNode.right);
            if(treeNode.left!=null)
                stack.push(treeNode.left);
            count++;
        }
        return count;
    }
}
