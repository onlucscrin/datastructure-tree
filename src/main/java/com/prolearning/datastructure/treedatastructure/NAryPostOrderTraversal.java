package com.prolearning.datastructure.treedatastructure;

import java.util.ArrayList;
import java.util.List;

public class NAryPostOrderTraversal {
    public static void main(String args[]){
        System.out.println("NAry Post orderTraversal here..");
    }


    public static List<Integer> preorderTraversal1(NNode root, List<Integer> preOrderResult) {
        if (root == null)
            return preOrderResult;
        for (NNode node : root.children) {
            preorderTraversal1(node, preOrderResult);
            preOrderResult.add((Integer) root.val);
        }
        return preOrderResult;
    }

    public List<Integer> postorder(NNode root) {
        List<Integer> preOrderResult = new ArrayList<>();
        return preorderTraversal1(root, preOrderResult);
    }



}

class NNode {
    public int val;
    public List<NNode> children;

    public NNode() {
    }

    public NNode(int _val) {
        val = _val;
    }

    public NNode(int _val, List<NNode> _children) {
        val = _val;
        children = _children;
    }
}

