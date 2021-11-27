package com.prolearning.datastructure.treedatastructure;

import java.util.*;

public class BinaryTreePostOrderTraversal {

    public static void main(String args[]){
        System.out.println("Binary tree main here...");
        Integer[] inputArray = {1,null,2,3};
        TreeNode node = TreeNode.createTree(inputArray);
        List<Integer> preOrderResult = new ArrayList<>();
        List<Integer> list = postOrderTraversal(node, preOrderResult);
        System.out.println("Recursive Output : " + list);
        list = postOrderTraversal(node);
        System.out.println("Recursive Output : " + list);
    }
    public static List<Integer> postOrderTraversal(TreeNode root, List<Integer> postOrderResult) {
        if(root==null)
            return postOrderResult;
        TreeNode treeNode = root;

        postOrderTraversal(treeNode.left, postOrderResult);
        postOrderTraversal(treeNode.right, postOrderResult);
        postOrderResult.add((Integer) treeNode.val);
        return postOrderResult;
    }
    public static List<Integer> postOrderTraversal(TreeNode root) {
        LinkedList<Integer> postOrderResult = new LinkedList<>();
        if(root==null)
            return postOrderResult;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            postOrderResult.addFirst((Integer) treeNode.val);
            if(treeNode.right!=null) {
                stack.push(treeNode.right);
            }
            if(treeNode.left!=null) {
                stack.push(treeNode.left);
            }
        }
        return postOrderResult;
    }
}
