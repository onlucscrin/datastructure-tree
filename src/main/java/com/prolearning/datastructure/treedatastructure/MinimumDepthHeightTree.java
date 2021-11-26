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

    }

    public static int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int level =0;
        int maxLevel = 0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println("Level : "+ level);
            System.out.println("node.left : "+ node.left);

            if(node.left!=null) {
                System.out.println("level.left : "+ level);
                stack.push(node.left);
            }
            else
            {
                maxLevel = Math.max(maxLevel, level);
                System.out.println("maxLevel : "+ maxLevel);
            }
            if(node.right!=null) {
                stack.push(node.right);
            }else
            {  maxLevel = Math.max(maxLevel, level);
                //  level--;
            }

        }
        return maxLevel+1;
    }

}
