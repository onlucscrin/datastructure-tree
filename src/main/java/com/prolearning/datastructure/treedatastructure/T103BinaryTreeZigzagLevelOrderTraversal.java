package com.prolearning.datastructure.treedatastructure;

import java.util.*;

public class T103BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String args[]) {
        System.out.println("****************T103BinaryTreeZigzagLevelOrderTraversal**********");
        Integer[] inputArray = {3,9,20,null,null,15,7};
        TreeNode root = TreeNode.createTree(inputArray);
        List<List<Integer>> result = zigzagLevelOrder(root);
        System.out.println("-------"+result);
        System.out.println("****************T103BinaryTreeZigzagLevelOrderTraversal**********");
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> treeList = new ArrayList<>();
        boolean leftToRight = true;
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.add(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer> levelList = Arrays.asList(new Integer[size+1]);
            for(int i=0;i<size;i++){
                //decide direction in which you need to add values to list, leftTo right or rightto left
                int index = i;
                if(!leftToRight)
                   index = size - i;
                System.out.println("index : "+ index);
                index = i;
                TreeNode node = dq.pop();
                levelList.set(index, (Integer) node.val);



                // add children
                if(node.left!=null)
                    dq.add(node.left);
                if(node.right!=null)
                    dq.add(node.right);
            }
            leftToRight = !leftToRight;
            treeList.add(levelList);
        }
        return treeList;
    }
}
