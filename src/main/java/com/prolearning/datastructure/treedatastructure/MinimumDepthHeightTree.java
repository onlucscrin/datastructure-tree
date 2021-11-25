package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumDepthHeightTree {
    public static void main(String args[]){
        System.out.println("Here in the main...");
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode<Integer> treeNode = TreeNode.createTree(nodes);
        int depth = maxDepth(treeNode);
        System.out.println("Depth : "+ depth);

    }

    public static int maxDepth(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.add(root);
        int level =0;
        while(!dq.isEmpty()){
            TreeNode node = dq.poll();
            dq.add(node.getLeftChild());
            dq.add(node.getRightChild());
            level = level+1;
        }
    }

}
