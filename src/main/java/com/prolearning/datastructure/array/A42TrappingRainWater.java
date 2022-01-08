package com.prolearning.datastructure.array;

public class A42TrappingRainWater {
    public static void main(String args[]){
        System.out.println("************A42TrappingRainWater****************");
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int resutl = trap(nums);
        System.out.println("Result :  " + resutl);
        System.out.println("************A42TrappingRainWater****************");
    }
    public static int trap(int[] height) {
                int n = height.length;
                int result =0;
                int[] left = new int[n];
                int[] right = new int[n];

                left[0] = height[0];
                for(int i=1; i<n; i++) {
                    left[i] = Math.max( left[i-1], height[i] );
                }

                right[n-1] = height[n-1];
                for(int i=height.length-2;i>=0;i--) {
                    right[i] = Math.max(right[i+1], height[i] );
                }

                for(int i=1;i<n-1;i++) {
                    result = result + Math.min(left[i], right[i]) - height[i];
                }

                return result;

    }
}
