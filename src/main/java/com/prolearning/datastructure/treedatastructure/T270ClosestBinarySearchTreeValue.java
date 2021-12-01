package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class T270ClosestBinarySearchTreeValue {
    public static void main(String args[]){
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
    }
    public static int closestValue(TreeNode root, double target) {
        int result = Integer.MAX_VALUE;
        double leastValueDiff = Integer.MAX_VALUE;

        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.push(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.pop();
            if(Math.abs(((Integer)node.val)-target) < leastValueDiff ){
                leastValueDiff = Math.abs(((Integer)node.val)-target);
                result = (Integer) node.val;
            }
            if(node.left!=null)
                queue.push(node.left);
            if(node.right!=null)
                queue.push(node.right);
        }
        return result;
    }
}
