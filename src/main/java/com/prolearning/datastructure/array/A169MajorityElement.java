package com.prolearning.datastructure.array;

public class A169MajorityElement {
    public static void main(String args[]){
        System.out.println("************A42TrappingRainWater****************");
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int resutl = majorityElement(nums);
        System.out.println("Result :  " + resutl);
        System.out.println("************A42TrappingRainWater****************");
    }
    public static int majorityElement(int[] nums) {
        int res = nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == res)
                count++;
            else
                count--;
            if(count<=0) {
                count = 1;
                res = nums[i];
            }
            System.out.println("Count : " + count + ", res " + res);
        }
        count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == res)
                count++;
        }
        System.out.println("Count : " + count + ", res " + res);
        if(count >= nums.length/2)
            return res;
        return -1;
    }
}
