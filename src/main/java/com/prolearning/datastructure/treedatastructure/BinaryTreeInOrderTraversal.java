package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {
    public static void main(String args[]){
        System.out.println("Binary Tree preorder traversal here...");
        Integer[] inputArray = {1,null,2,3};
        TreeNode node = TreeNode.createTree(inputArray);
        List<Integer> preOrderResult = new ArrayList<>();
        List<Integer> list = inOrderTraversal(node, preOrderResult);
        System.out.println("Recursive Output " + list);
        list = inOrderTraversal(node);
        System.out.println("Normal Output " + list);
    }
    public static List<Integer> inOrderTraversal(TreeNode root, List<Integer> preOrderResult) {
         if(root==null)
            return preOrderResult;
        TreeNode treeNode = root;
        inOrderTraversal(treeNode.right, preOrderResult);
        inOrderTraversal(treeNode.left, preOrderResult);
        preOrderResult.add((Integer) treeNode.val);
         return preOrderResult;
    }
    public static List<Integer> inOrderTraversal(TreeNode root) {
        LinkedList<Integer> preOrderResult = new LinkedList<>();
        if(root==null)
            return preOrderResult;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            preOrderResult.addFirst((Integer) treeNode.val);
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
