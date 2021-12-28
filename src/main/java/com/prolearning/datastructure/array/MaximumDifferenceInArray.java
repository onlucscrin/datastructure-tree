package com.prolearning.datastructure.array;

public class MaximumDifferenceInArray {
    public static void main(String args[]){
        System.out.println("********MaximumDifferenceInArray*************************");
//        int[] nums = {1,2,3,4,5};
//        int nums[] = {2,1};
//        int nums[]={2,1,3,4};
        int[] nums = {1, 2, 3};
//        int[] nums = {3,2,1};
        System.out.println("Results: " + maximumDifference(nums));
        System.out.println("********MaximumDifferenceInArray*************************");
    }
    public static int maximumDifference(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int resultDiff = -1;
        for(int i=0;i<nums.length;i++) {
            resultDiff = Math.max(resultDiff, nums[i] -minimum);
            System.out.println(nums[i] -minimum);
            minimum = Math.min(minimum, nums[i]);
        }
        if(resultDiff<=0)
            return -1;
        return resultDiff;
    }
}
