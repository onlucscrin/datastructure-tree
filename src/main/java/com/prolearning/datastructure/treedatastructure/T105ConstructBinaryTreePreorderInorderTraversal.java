package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class T105ConstructBinaryTreePreorderInorderTraversal {
    public static void main(String args[]) {
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        buildTree(preorder, inorder);
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Deque<Integer> preq = new ArrayDeque<>();
        for(int i=0;i<preorder.length;i++){
            preq.add(preorder[i]);
        }
        Deque<Integer> inq = new ArrayDeque<>();
        for(int i=0;i<inorder.length;i++){
            inq.add(inorder[i]);
        }

        //Printing pre order to checkif all is good
//        System.out.println();
//        while(!preq.isEmpty()){
//            System.out.print(",  "+ preq.pop() );
//        }
//        System.out.println();
//        while(!inq.isEmpty()){
//            System.out.print(",  "+ inq.pop() );
//        }
//        System.out.println();
        //Printing pre order to checkif all is good


        //running through the preorder array and popping each out as root
        TreeNode root = buildRecursive(preq, inq);
        while (root!=null){
            System.out.println(root.val);
            root = root.left;
        }
        while (root!=null){
            System.out.println("right :  " + root.val);
            root = root.right;
        }
        return root;
    }

    public static TreeNode buildRecursive(Deque<Integer> preq, Deque<Integer> inq){

        if(preq.isEmpty() || inq.isEmpty())
            return null;

        TreeNode rootNode = null;
        Deque<Integer> leftQ;
        Deque<Integer> rightQ;
        int root = preq.pop();
        rootNode = new TreeNode(root);

        leftQ = new ArrayDeque();
        rightQ = new ArrayDeque();

        while(!inq.isEmpty()){
            int rootLocal = inq.pop();
            if(rootLocal== root) {
                break;
            }
            leftQ.add(rootLocal);
        }
        TreeNode node = buildRecursive(preq, leftQ);
        if(node!=null) {
            rootNode.left = node;
        }

        while(!inq.isEmpty()){
            int rootLocal = inq.pop();
            rightQ.add(rootLocal);
        }
        node = buildRecursive(preq, rightQ);
        if(node!=null) {
            rootNode.right = node;
        }
        //break in to two buckets
        return rootNode;
    }
//Not currently in the solution so will ignore as of now...

//    public static TreeNode buildRecursive(Deque<Integer> preq, Deque<Integer> inq){
//
//        if(preq.isEmpty() || inq.isEmpty())
//            return null;
//
//        TreeNode rootNode = null;
//        Deque<Integer> leftQ;
//        Deque<Integer> rightQ;
//        while (!preq.isEmpty()) {
//            int root = preq.pop();
//            rootNode = new TreeNode(root);
//
//            leftQ = new ArrayDeque();
//            rightQ = new ArrayDeque();
//
//            while(!inq.isEmpty()){
//                int rootLocal = inq.pop();
//                if(rootLocal== root) {
//                    break;
//                }
//                leftQ.add(rootLocal);
//            }
//            TreeNode node = buildRecursive(preq, leftQ);
//            if(node!=null) {
//                rootNode.left = node;
//            }
//
//            while(!inq.isEmpty()){
//                int rootLocal = inq.pop();
//                rightQ.add(rootLocal);
//            }
//            node = buildRecursive(preq, rightQ);
//            if(node!=null) {
//                rootNode.right = node;
//            }
//            //break in to two buckets
//        }
//        return rootNode;
//    }

}
