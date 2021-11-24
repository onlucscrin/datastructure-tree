package com.prolearning.datastructure.treedatastructure;

import lombok.Data;

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
}
