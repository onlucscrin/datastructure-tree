package com.prolearning.datastructure.treedatastructure;

public class CheckForChildrenSumProperty {
    public static void main(String args[]){
        System.out.println("****************************CheckForChildrenSumProperty********************");
        Integer[] input = {10,8,2,5,3,2};
        TreeNode root = TreeNode.createTree(input);
        isSumProperty(root);
        System.out.println("****************************CheckForChildrenSumProperty********************");
    }
    public static boolean isSumProperty(TreeNode root){
        if(root==null)
            return true;
       boolean result = isSumPropertyRecursive(root);
        System.out.println(" Check sum : "+ result);
        return result;
    }
    public static boolean isSumPropertyRecursive(TreeNode root){
        if(root==null ||(root.left==null && root.right==null))
            return true;
        int rootVal=0, leftVal=0, rightVal=0;
        rootVal= (Integer)root.val;
        if(root.right!=null)
            leftVal= (Integer)root.right.val;
        if(root.left!=null)
            rightVal= (Integer)root.left.val;

        if(rootVal!= leftVal+rightVal)
            return false;
        return isSumPropertyRecursive(root.left) &&
        isSumPropertyRecursive(root.right);
    }
}
