package com.prolearning.datastructure.array;

import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.PriorityQueue;

public class A215KthLargestElementinanArray {
    public static void main(String args[]){
        System.out.println("******************A215KthLargestElementinanArray***********");
//        int[] input = {};
//        int[] input = {9, 8, 7};
        int[] input = {5, 8 , 20 , 10};
        int k=4;
        int result = findKthMaximumNumber(input, k);
        System.out.println("Largest No :- " + result);
        System.out.println("******************A215KthLargestElementinanArray***********");
    }
    public static int findKthMaximumNumber(int arr[], int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //k= arr.length - k;
        for(int i=0;i<arr.length;i++){
            queue.add(arr[i]);
            if(queue.size()>k)
            {
                System.out.println("remove : " + Collections.min(queue));
                queue.remove(Collections.min(queue));
            }
        }
        System.out.println(queue.size() + "----"+Collections.min(queue));
        if(queue.size() == k)
            return Collections.min(queue);
        return Collections.max(queue);
    }
}
