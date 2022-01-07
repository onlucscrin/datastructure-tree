package com.prolearning.datastructure.array;

public class A918MaximumSubarrayCircular {
    public static void main(String args[]){
        System.out.println("*****A485MaxConsecutiveOnes*****");
        int nums[] = {1,2,3,4,5};
        System.out.println();
        System.out.println("*****A485MaxConsecutiveOnes*****");
    }
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int addMax = 0;
        boolean start = true;
        boolean end = false;
        int startMax = 0;
        for(int i=0;i<nums.length;i++){

            if(addMax > (nums[i]+ addMax))
            {
                start = false;
                startMax = addMax;
            }
            if(i==nums.length-1 && (addMax+nums[i] > addMax))
                end = true;
            addMax = Math.max(nums[i]+addMax, nums[i]);
            max= Math.max(addMax, max);
        }
        if(end && !start)
            max = Math.max(startMax+ max , max);
        return max;
    }
}
