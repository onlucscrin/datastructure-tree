package com.prolearning.datastructure.search;

public class A1TwoSum {
    public static void main(String args[]){
        System.out.println("******A1TwoSum******");
        int[] nums = {1,3,5,6,7,8};
        int[] result  = twoSum(nums, 8);
        for(int res : result)
        System.out.println(" two sum  : " + res);
        System.out.println("******A1TwoSum******");
    }
    public static int[] twoSum(int[] nums, int target) {
            int l = 0, h=nums.length-1;
            while(l<=h){
                System.out.println("l : " +  l + ", h:" + h);
                if(nums[l] + nums[h] == target)
                    return new int[]{l, h};
                else if((nums[l] + nums[h]) > target)
                    h = h-1;
                else if((nums[l] + nums[h]) > target)
                    l=l+1;
            }
            return new int[]{-1};
    }
}
