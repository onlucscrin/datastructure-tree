package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayList;
import java.util.List;

public class NAryInOrderTraversal {
    public static void main(String args[]){
        System.out.println("NAry Post orderTraversal here..");
    }


    public static List<Integer> inOrderTraversal(Node root, List<Integer> preOrderResult) {
        if (root == null)
            return preOrderResult;
//        for (Node node : root.children) {
//            preOrderResult.add((Integer) root.val);
//            inOrderTraversal(node, preOrderResult);
//        }
        return preOrderResult;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> preOrderResult = new ArrayList<>();
        return inOrderTraversal(root, preOrderResult);
    }



}

