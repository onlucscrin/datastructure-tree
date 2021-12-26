package com.prolearning.datastructure.array;

public class A283MoveZeroes {
    public static void main(String args[]){
        System.out.println("**************A283MoveZeroes*****************");

        System.out.println("**************A283MoveZeroes*****************");
    }
    public void moveZeroes(int[] nums) {
        int cur=0;
        for(int next=1; next<nums.length; next++){
            if(nums[cur]==0 && nums[next]!=0){
                nums[cur]=nums[next];
            }
            if(nums[cur]!=0){
                cur++;
            }
        }
    }
}
