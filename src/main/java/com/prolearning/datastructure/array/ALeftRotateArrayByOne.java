package com.prolearning.datastructure.array;

public class ALeftRotateArrayByOne {
    public static void main(String args[]){
        System.out.println("**************ALeftRotateArrayByOne****************");
        int nums[] = {1,2,3,4};
        leftRotateByOne(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print("-- "+ nums[i]);
        }
        System.out.println("**************ALeftRotateArrayByOne****************");
    }
    public static void leftRotateByOne(int[] nums){
        int temp = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1)
                nums[i] = temp;
            else
                nums[i] = nums[i+1];
        }
    }
}
