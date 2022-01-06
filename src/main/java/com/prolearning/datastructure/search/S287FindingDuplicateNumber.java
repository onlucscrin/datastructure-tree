package com.prolearning.datastructure.search;

public class S287FindingDuplicateNumber {
    public static void main(String args[]){
        System.out.println("*****S287FindingDuplicateNumber*******");
        System.out.println("*****S287FindingDuplicateNumber*******");
    }
    public int findDuplicate(int[] nums) {
        int duplicate = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int cur = nums[i];
            if(cur < 0)
                duplicate = cur;
            nums[i] = -1*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        System.out.println("duplicate : " + duplicate);
        return duplicate;
    }
    public int findDuplicateFloydAlgorithm(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
        }

        System.out.println("duplicate : " + fast);
        return nums[fast];
    }
}
