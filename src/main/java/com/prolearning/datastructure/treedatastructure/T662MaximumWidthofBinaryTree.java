package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class T662MaximumWidthofBinaryTree {
    public static void main(String[] args){
        System.out.println("***********T110BalancedBinaryTree*********");
        System.out.println("***********T110BalancedBinaryTree*********");
    }
    public int widthOfBinaryTreePureWidth(TreeNode root) {
        if(root==null)
            return 0;
        int maxWidth = 1;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            maxWidth = Math.max(maxWidth, size);
            for(int i=0;i<size;i++){
                TreeNode current = queue.pop();
                if(current.left!=null)
                    queue.push(current.left);
                if(current.right!=null)
                    queue.push(current.right);
            }
        }
        return maxWidth;
    }
    public int widthOfBinaryTreeWithZeroes(TreeNode root) {

        HashMap<TreeNode, Integer> map = new HashMap<>();
        if(root==null)
            return 0;
        int maxWidth = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);
        map.put(root, 0);
        int leftPlace = Integer.MAX_VALUE, rightPlace = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size = queue.size();
            leftPlace = Integer.MAX_VALUE; rightPlace = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode current = queue.pop();
                int place  = map.get(current);
                leftPlace = Math.min(leftPlace, place);
                rightPlace = Math.max(rightPlace, place);
                System.out.println( ": val :"+current.val);
                if(current.left!=null){
                    queue.add(current.left);
                    int leftPlace1 = (2*place +1);
                    map.put(current.left, leftPlace1);
                    System.out.println("leftPlace : "+ leftPlace + ", leftPlace1 : "+leftPlace1);
                }
                if(current.right!=null){
                    queue.add(current.right);
                    int rightPlace1 = (2*place +2);
                    map.put(current.right, rightPlace1);
                }
            }
            System.out.println("leftPlace : "+ leftPlace + ", rightPlace : "+rightPlace);
            System.out.println("********Diff***********: " + Math.abs(leftPlace - rightPlace));
            maxWidth = Math.max(maxWidth, Math.abs(leftPlace - rightPlace)) ;
            System.out.println("********Diff***********: " + maxWidth);
        }
        return maxWidth+1;
    }
}
