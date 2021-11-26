package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayList;
import java.util.List;

public class NAryPostOrderTraversal {
    public static void main(String args[]){
        System.out.println("NAry Post orderTraversal here..");
    }


    public static List<Integer> preorderTraversal1(Node root, List<Integer> preOrderResult) {
        if (root == null)
            return preOrderResult;
        for (Node node : root.children) {
            preorderTraversal1(node, preOrderResult);
            preOrderResult.add((Integer) root.val);
        }
        return preOrderResult;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> preOrderResult = new ArrayList<>();
        return preorderTraversal1(root, preOrderResult);
    }



}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

