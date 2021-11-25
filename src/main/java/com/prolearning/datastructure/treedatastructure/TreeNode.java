package com.prolearning.datastructure.treedatastructure;

import lombok.Data;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @param <T>
 */
@Data
public class TreeNode<T> implements Comparable {
    private T value;
    private TreeNode leftChild;
    private TreeNode rightChild;
    public TreeNode(T value){
        this.value = value;
    }
    public TreeNode(T value, TreeNode leftChild, TreeNode rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
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
        PriorityQueue<TreeNode<Integer>> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(rootNode);
        while(!priorityQueue.isEmpty()){
            TreeNode temp = priorityQueue.poll();
            System.out.println(temp.value);

            if(temp.leftChild!=null)
                priorityQueue.add(temp.leftChild);
            if(temp.rightChild!=null)
                priorityQueue.add(temp.rightChild);
        }
    }

    public static TreeNode createTree(Integer[] nodes){

        if(nodes.length<1)
            return null;

        int index = 0;

        PriorityQueue<TreeNode> priorityQueue = new PriorityQueue();
        TreeNode rootNode = new TreeNode(nodes[0]);
        priorityQueue.offer(rootNode);

        while(!priorityQueue.isEmpty()){
            TreeNode parentNode = priorityQueue.poll();
            if (index + 1 < nodes.length ) {
                parentNode.leftChild = new TreeNode(nodes[++index]);
                priorityQueue.add(parentNode.leftChild);
            }
            if (index + 1 < nodes.length ) {
                parentNode.rightChild = new TreeNode(nodes[++index]);
                priorityQueue.add(parentNode.rightChild);
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
        rootNode.setLeftChild(createTreeRecursion(nodes, i,level+1));
        rootNode.setRightChild(createTreeRecursion(nodes, i+1,  level+1));
        return rootNode;
    }

    @Override
    public int compareTo(Object o) {
        int value1 = (int) ((TreeNode)o).value;
        if((int)this.value == value1)
            return 0;
        if((int)this.value > value1)
            return 1;
        if((int)this.value < value1)
            return -1;
        return -1;
    }
}
