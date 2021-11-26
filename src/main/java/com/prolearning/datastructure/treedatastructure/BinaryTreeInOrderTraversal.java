package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {
    public static void main(String args[]){
        System.out.println("Binary Tree preorder traversal here...");
        Integer[] inputArray = {1,null,2,3};
        TreeNode node = TreeNode.createTree(inputArray);
        List<Integer> preOrderResult = new ArrayList<>();
        List<Integer> list = preorderTraversal(node, preOrderResult);
        System.out.println("Output " + list);
    }
    public static List<Integer> preorderTraversal(TreeNode root,  List<Integer> preOrderResult) {
         if(root==null)
            return preOrderResult;
        TreeNode treeNode = root;
        preorderTraversal(treeNode.right, preOrderResult);
        preorderTraversal(treeNode.left, preOrderResult);
        preOrderResult.add((Integer) treeNode.val);
         return preOrderResult;
    }
}
