package com.prolearning.datastructure.array;

public class AMinimumNumberFlips {
    public static void main(String args[]){
        System.out.println("************A42TrappingRainWater****************");
        int[] nums = {0,1,1, 1,0,1};
        int resutl = minimumFlipsIndex(nums);
        System.out.println("Result :  " + resutl);
        System.out.println("************A42TrappingRainWater****************");
    }
    public static int minimumFlipsIndex(int[] nums) {
        int count = 0;
        int index = 0;
        for(int i=1;i<nums.length;i++) {
                if(nums[i-1]!=nums[i] && nums[i]!=nums[0])
                {
                    index = i;
                    count++;
                }
                else if(nums[i-1]!=nums[i]){
                    System.out.println(index + "  .. to .. "+ (i-1));
                  //  index  = Integer.MAX_VALUE;
                }


        }
        if(nums[0]!=nums[nums.length-1]){
            System.out.println(index + "  .. to .. "+ (nums.length-1));
            //  index  = Integer.MAX_VALUE;
        }
        return count;
    }
}
