package com.prolearning.datastructure.treedatastructure;

import java.util.Stack;

public class T426ConvertBinarySearchTreeSortedDLL {
    public static void main(String args[]) {
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
    }

    public Node treeToDoublyList(Node root) {
        if(root==null)
            return new Node();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node head = null;
     //   Node nextNode = null;
        Node prevNode = null;
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.val);
            if(node.left!=null)
                stack.push(node.left);
            if(node.right!=null)
                stack.push(node.right);
            if(node.left==null && node.right==null && head==null) {
                head = node;
                prevNode = head;
                head.left = null;
            }
            if(prevNode!=null){
                prevNode.right = node;
                node.left = prevNode;
            }

        }
        return head;
    }
    public void checkDLL(Node root){
        Node next = root.right;
        while(next == root){
            System.out.println(next.val + "  ---> ");
            next = next.right;
        }
        while(next == root){
            System.out.println(next.val + "  ---> ");
            next = next.left;
        }
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
