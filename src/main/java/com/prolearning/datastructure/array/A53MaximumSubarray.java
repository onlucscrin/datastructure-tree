package com.prolearning.datastructure.array;

public class A53MaximumSubarray {
    public static void main(String args[]){
        System.out.println("*****A485MaxConsecutiveOnes*****");

        System.out.println("*****A485MaxConsecutiveOnes*****");
    }
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int addMax = 0;
        for(int i=0;i<nums.length;i++){
            addMax = Math.max(nums[i] + addMax, nums[i]);
            max = Math.max(addMax,max);
        }
        return max;
    }
}
