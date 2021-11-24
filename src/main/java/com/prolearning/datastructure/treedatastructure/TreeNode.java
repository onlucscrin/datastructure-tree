package com.prolearning.datastructure.treedatastructure;

import lombok.Data;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @param <T>
 */
@Data
public class TreeNode<T> {
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
        TreeNode treeNode = createTreeRecursion(array, 0, 0);
        System.out.println(treeNode);
    }
    public TreeNode<T> createTree(Integer[] nodes, int i){
        TreeNode rootNode = null;
        if(nodes.length>1)
            rootNode = new TreeNode(nodes[0]);

        PriorityQueue<TreeNode>  = new Stack();
        for(int i=0;i<nodes.length;i++){
            if(treeNodesStack.isEmpty())
                treeNodesStack.push(nodes[i]);
            else
            {
                treeNodesStack.pop().value = nodes[i];
                treeNodesStack.
            }
        }


    }
    public static TreeNode createTreeRecursion(Integer[] nodes, int i, int level){
        if(2*level >= nodes.length)
            return null;
        TreeNode rootNode = new TreeNode(nodes[i]);
        rootNode.setLeftChild(createTreeRecursion(nodes, (2*level+1), level+1));
        rootNode.setRightChild(createTreeRecursion(nodes, (2*level+2) , level+1));
        return rootNode;
    }
}
