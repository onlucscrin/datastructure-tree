package com.prolearning.datastructure.treedatastructure;

import java.util.Stack;

public class T426ConvertBinarySearchTreeSortedDLL {
    public static void main(String args[]) {
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
        Integer[] input = {4,2,5,1,3};
//        Node root
        System.out.println("****************T270ClosestBinarySearchTreeValue**********");
    }
    public Node treeToDoublyListRecursive(Node root) {
        if(root==null)
            return null;
        Node nextRoot = treeToDoublyList(root.left);
        if(root!=null)
            root.right = nextRoot;
        if(nextRoot!=null)
            nextRoot.left = root;
        Node right = treeToDoublyList(root.right);
        return nextRoot;
    }
    public Node treeToDoublyList(Node root) {
        if(root==null)
            return null;

        Node prevRoot = treeToDoublyList(root.left);

        if(prevRoot!=null && prevRoot.right==null)
        {
            //System.out.println( prevRoot.left.val + "--->" + prevRoot.val+"--> " + prevRoot.right.val );
            prevRoot.right = root;
            System.out.println(  "--->" + prevRoot.val+"--> " + prevRoot.right.val );
        }
        root.left = prevRoot;

        if(prevRoot!=null)
            System.out.println("root : " + root.val + ", PrevRoot : "+ prevRoot.val);
        else
            System.out.println("root : " + root.val + ", PrevRoot : "+ prevRoot);


        Node nextRoot = treeToDoublyList(root.right);
        root.right = nextRoot;
        if(root.right!=null)
            System.out.println("root : " + root.val + ", nextRoot : "+ root.right.val);
        else
            System.out.println("root : " + root.val + ", nextRoot : "+ root.right);


        if(nextRoot!=null)
            System.out.println("returning : "+ nextRoot.val);



        if(root.right ==null)
            return root;
        return root.right;
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
