package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayList;
import java.util.List;

public class NodesAtKDistanceFromRoot {
    public static void main(String args[]){
        System.out.println("***********************************");
        System.out.println("Nodes at K distance from Root...");
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode<Integer> treeNode = TreeNode.createTree(nodes);
        List<Integer> result  = distanceK(treeNode, 2);
        System.out.println(result);
        System.out.println("***********************************");
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        return null;
    }
    public static List<Integer> distanceK(TreeNode root, int k) {
        List<Integer> result = distanceKRecursive(root, 0, k);
        return result;
    }
    public static List<Integer> distanceKRecursive(TreeNode root, int k, int targetK) {
        if(root == null)
            return null;
        List<Integer> result = new ArrayList<>();
        if(k == targetK) {
            result.add((Integer) root.val);
            return result;
        }
        result.addAll(distanceKRecursive(root.left, k+1, targetK));
        result.addAll(distanceKRecursive(root.right, k+1, targetK));
        return result;
    }
}
