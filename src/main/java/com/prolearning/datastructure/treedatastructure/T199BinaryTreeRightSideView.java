package com.prolearning.datastructure.treedatastructure;

import java.util.*;

public class T199BinaryTreeRightSideView {
    static int maxLevel = 0;
    public static void main(String args[]){
        System.out.println("*******************T199BinaryTreeRightSideView****************");
        Integer[] input = {1,2,3,null,5,null,4};
        TreeNode node = TreeNode.createTree(input);
        List<Integer> result = rightSideView(node);
        System.out.println("Result : "+ result);

//        input = new Integer[]{1, 3};
//        node = TreeNode.createTree(input);
//        result = rightSideView(node);
        System.out.println("Result : "+ result);
        System.out.println("*******************T199BinaryTreeRightSideView****************");
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Deque<TreeNode> arrayDeque = new ArrayDeque<>();
        Deque<TreeNode> arrayDeque2 = new ArrayDeque<>();
        arrayDeque.push(root);
        while(!arrayDeque.isEmpty() || !arrayDeque2.isEmpty()){
            List<Integer> tmpResult = new ArrayList<>();
            while(!arrayDeque.isEmpty()){


                TreeNode treeNode = arrayDeque.pop();
                if(tmpResult.size() <1)
                    tmpResult.add((Integer)treeNode.val);
                if(treeNode.right!=null)
                    arrayDeque2.addFirst(treeNode.right);
                if(treeNode.left!=null)
                    arrayDeque2.addLast(treeNode.left);


            }
            result.addAll(tmpResult);
            tmpResult = new ArrayList<>();
            while(!arrayDeque2.isEmpty()){


                TreeNode treeNode = arrayDeque2.pop();
                if(tmpResult.size() <1)
                    tmpResult.add((Integer)treeNode.val);
                if(treeNode.right!=null)
                    arrayDeque.addFirst(treeNode.right);
                if(treeNode.left!=null)
                    arrayDeque.addFirst(treeNode.left);


            }
            result.addAll(tmpResult);
        }
        return result;
    }

    public static void rightSideViewRecursive(TreeNode root, int level, List<Integer> list){
        if(root ==null)
            return;
        System.out.println("Maxlevel : "+ maxLevel + ", Level:"+level+ ", val : "+ root.val);
        if(maxLevel < level)
        {
            System.out.println("Inside iiiii  iiii Maxlevel : "+ maxLevel + ", Level:"+level+ ", val : "+ root.val);
            list.add((Integer) root.val);
            maxLevel = level;
        }
        rightSideViewRecursive(root.right, level+1, list);
        rightSideViewRecursive(root.left, level+1, list);
    }
    public static List<Integer> rightSideViewStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Deque<TreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(root);
        while(!arrayDeque.isEmpty()){
            TreeNode<Integer> treeNode = arrayDeque.pop();
            result.add(treeNode.val);
            if(treeNode.right!=null)
                arrayDeque.push(treeNode.right);
        }
        return result;
    }
}
