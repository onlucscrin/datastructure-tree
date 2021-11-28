package com.prolearning.datastructure.treedatastructure;

import java.util.*;

public class T102BinaryTreeLevelOrderTraversal {

    public static void main(String args[]){
        System.out.println("*****************************T102BinaryTreeLevelOrderTraversal*****************************");
        System.out.println("*****************************T102BinaryTreeLevelOrderTraversal*****************************");
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        Deque<TreeNode> deque2 = new ArrayDeque<>();
        List<List<Integer>> parentChild = new ArrayList<>();
        deque.push(root);
        while(!deque.isEmpty() && !deque2.isEmpty()){
            List<Integer> child = new ArrayList();
            while(!deque.isEmpty()){
                TreeNode treeNode = deque.getFirst();
                System.out.println("deque : "+ treeNode.val);
                child.add((Integer) treeNode.val);
                if(treeNode.right!=null)
                    deque2.add(treeNode.right);
                if(treeNode.left!=null)
                    deque2.add(treeNode.left);
            }
            parentChild.add(child);
            child = new ArrayList();
            while(!deque2.isEmpty()){
                TreeNode treeNode = deque2.pop();
                System.out.println("deque : "+ treeNode.val);
                child.add((Integer) treeNode.val);
                if(treeNode.right!=null)
                    deque2.add(treeNode.right);
                if(treeNode.left!=null)
                    deque2.add(treeNode.left);
            }
            parentChild.add(child);
        }
        return parentChild;
    }
}
