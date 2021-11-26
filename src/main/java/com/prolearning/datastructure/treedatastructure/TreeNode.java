package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @param <T>
 */
public class TreeNode<T> {
    public T val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(T val){
        this.val = val;
    }
    public TreeNode(T val, TreeNode leftChild, TreeNode rightChild){
        this.val = val;
        this.left = leftChild;
        this.right = rightChild;
    }

    public static void main(String[] args){
        System.out.println("Tree Node main here");
        System.out.println("Tree : ");
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        TreeNode rootNode = createTreeRecursion(array, 0, 0);
        System.out.println(rootNode);
        printTree(rootNode);

    }

    public static void printTree(TreeNode rootNode){
        Deque<TreeNode<Integer>> priorityQueue = new ArrayDeque<>();
        priorityQueue.add(rootNode);
        while(!priorityQueue.isEmpty()){
            TreeNode temp = priorityQueue.poll();
            System.out.println(temp.val);

            if(temp.left !=null)
                priorityQueue.add(temp.left);
            if(temp.right !=null)
                priorityQueue.add(temp.right);
        }
    }

    public static TreeNode createTree(Integer[] nodes){

        if(nodes.length<1)
            return null;

        int index = 0;

        Deque<TreeNode> priorityQueue = new ArrayDeque<>();
        TreeNode rootNode = new TreeNode(nodes[0]);
        priorityQueue.offer(rootNode);

        while(!priorityQueue.isEmpty()){
            TreeNode parentNode = priorityQueue.poll();
            if (index + 1 < nodes.length ) {
                parentNode.left = new TreeNode(nodes[++index]);
                priorityQueue.add(parentNode.left);
            }
            if (index + 1 < nodes.length ) {
                parentNode.right = new TreeNode(nodes[++index]);
                priorityQueue.add(parentNode.right);
            }
        }
        return rootNode;
    }
    public static TreeNode createTreeRecursion(Integer[] nodes, int i, int level){
        int j = (((int)Math.pow(2, level))-1 ) ;
        if(i+j >= nodes.length)
            return null;

        System.out.println("i = " + i +" , j :" + j +", i+j:" + (i+j));
        TreeNode rootNode = new TreeNode(nodes[i]);
        rootNode.left = createTreeRecursion(nodes, i,level+1);
        rootNode.right = createTreeRecursion(nodes, i+1,  level+1);
        return rootNode;
    }
//
//    @Override
//    public int compareTo(Object o) {
//        if(o instanceof  Integer){
//        int value1 = (int) ((TreeNode)o).value;
//        if((int)this.value == value1)
//            return 0;
//        if((int)this.value > value1)
//            return 1;
//        if((int)this.value < value1)
//            return -1;}
//        return -1;
//    }
}
