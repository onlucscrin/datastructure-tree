package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MinimumDepthHeightTree {
    public static void main(String args[]){
        System.out.println("Here in the main...");
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode<Integer> treeNode = TreeNode.createTree(nodes);
        int depth = maxDepth(treeNode);
        System.out.println("Depth : "+ depth);
        depth = maxDepthRecursion(treeNode, 0);
        System.out.println("Recursion Depth : "+ depth);

    }
    public static int maxDepthRecursion(TreeNode root, int level) {
        if(root == null)
            return 0;
        int leftHeight = 1 + maxDepthRecursion(root.left, level);
        int rightHeight = 1 + maxDepthRecursion(root.right, level);
        return Math.max(leftHeight, rightHeight);
    }
    public static int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stackLevel = new Stack<>();
        stack.push(root);
        stackLevel.push(1);
        int level =0;
        int maxLevel = 0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            Integer stackLev  = stackLevel.pop();
            if(node.left!=null || node.right!=null){
                stackLev++;
                if(node.left!=null){
                    stack.push(node.left);
                    stackLevel.push(stackLev);}
                if(node.right!=null) {
                    stack.push(node.right);
                    stackLevel.push(stackLev);
                }
            }
            else
                maxLevel = Math.max(maxLevel, stackLev);
        }
        return maxLevel;
    }

}
