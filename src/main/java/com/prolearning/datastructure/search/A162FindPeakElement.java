package com.prolearning.datastructure.search;

public class A162FindPeakElement {
    public static void main(String args[]){
        System.out.println("******A69SqrtX******");
        int[] nums = {12,3,5,6,7,34};
        System.out.println("square root : " + findPeakElement(nums));
        System.out.println("******A69SqrtX******");
    }
    public static int findPeakElement(int[] nums) {
        int low = 0, high = nums.length;
        while(low<=high){
            int mid = ((high-low)/2 )+ low;
            System.out.println("mid : " +  mid);
            if(mid== nums.length-1 && nums[mid]>nums[mid-1])
                return mid;
            else if(mid== 0 && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid] > nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
            else if(nums[mid] < nums[mid-1])
                high = mid-1;
            else if(nums[mid] < nums[mid + 1])
                low = mid+1;
        }
        return -1;
    }
}
