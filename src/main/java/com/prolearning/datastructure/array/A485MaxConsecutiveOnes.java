package com.prolearning.datastructure.array;

public class A485MaxConsecutiveOnes {
    public static void main(String args[]){
        System.out.println("*****A485MaxConsecutiveOnes*****");

        System.out.println("*****A485MaxConsecutiveOnes*****");
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                max = Math.max(count, max);
            count =0;
            }
            else
            count++;
        }
        return  max;
    }
}
