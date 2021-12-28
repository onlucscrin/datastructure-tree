package com.prolearning.datastructure.array;

public class A283MoveZeroes {
    public static void main(String args[]){
        System.out.println("**************A283MoveZeroes*****************");

        System.out.println("**************A283MoveZeroes*****************");
    }
    public void moveZeroes(int[] nums) {
        int cur=0;
        for(int next=0; next<nums.length; next++){
            if(cur != next && nums[next]!=0){
                int temp = nums[cur];
                nums[cur]=nums[next];
                nums[next] = temp;
                cur++;
            }
            else if(nums[cur]!=0 && cur==next){
                cur++;
            }
        }
    }
}
