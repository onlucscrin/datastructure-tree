package com.prolearning.datastructure.array;

public class LargestElementArray {
    public static void main(String args[]){
        System.out.println("******************LargestElementArray***********");
        int[] input = {};
//        int[] input = {9, 8, 7};
        //int[] input = {5, 8 , 20 , 10};
        int result = findLargestNumber(input);
        System.out.println("Largest No :" + result);
        System.out.println("******************LargestElementArray***********");
    }

    public static int findLargestNumber(int arr[]){
        Integer result  = Integer.MIN_VALUE;
        Integer index  = -1;
        for(int i=0;i<arr.length;i++){
            if(result < arr[i]){
                result = arr[i];
                index = i;
            }
        }
        return index;
    }
}
