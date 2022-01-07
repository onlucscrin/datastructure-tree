package com.prolearning.datastructure.array;

public class SecondLargestNumber {
    public static void main(String args[]){
        System.out.println("******************SecondLargestNumber***********");
//        int[] input = {};
//        int[] input = {9, 8, 7};
//        int[] input = {5, 8 , 20 , 10};
//        int[] input = {10, 5, 8, 20};
    //    int[] input = {20, 10 ,20, 8, 12};
        int[] input = {10,10, 10};

        int result = findSecondLargestNumber(input);
        System.out.println("Second Largest No :" + result);
        System.out.println("******************SecondLargestNumber***********");
    }
    public static int findSecondLargestNumber(int arr[]){
        Integer maxResult  = Integer.MIN_VALUE;
        Integer maxIndex  = -1;
        Integer maxResult_1  = Integer.MIN_VALUE;
        Integer maxIndex_2  = -1;
        for(int i=0;i<arr.length;i++) {
            if(maxResult < arr[i] ){
                maxResult_1 = maxResult;
                maxIndex_2 = maxIndex;

                maxResult = arr[i];
                maxIndex = i;
            }
           else if(maxResult_1 < arr[i] && arr[i] < maxResult ){
                maxResult_1 = arr[i];
                maxIndex_2 = i;
            }
        }
        return maxIndex_2;
    }

}
