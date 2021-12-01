package com.prolearning.datastructure.treedatastructure;

public class T110BalancedBinaryTree {
    public static void main(String[] args){
        System.out.println("***********T110BalancedBinaryTree*********");
        System.out.println("***********T110BalancedBinaryTree*********");
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int result = chckHeightRecursive(root);
        if(chckHeightRecursive(root) >=1)
            return true;
        return false;
    }
    public static int chckHeightRecursive(TreeNode root) {
        if(root==null)
            return 0;
        int heightLeft = chckHeightRecursive(root.left);
        int heightRight = chckHeightRecursive(root.right);
        if(heightLeft==-1 || heightRight==-1)
            return -1;
        int currHeight = Math.max(heightLeft, heightRight) + 1;
        if(Math.abs(heightLeft - heightRight) <= 1)
            return currHeight;
        else
            return -1;
    }
}
