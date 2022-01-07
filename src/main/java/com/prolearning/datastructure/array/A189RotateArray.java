package com.prolearning.datastructure.array;

public class A189RotateArray {
    public static void main(String args[]){
        System.out.println("***********A189RotateArray***********");
        int nums[] = {0,1,2,3,4,5,6,7,8};
        rotate(nums, 3);
        for(int i=0;i<nums.length;i++){
            System.out.print("-- "+ nums[i]);
        }
        System.out.println("***********A189RotateArray***********");
    }
    public static void rotate(int[] nums, int k) {
        int i=0, count =0;
        int temp = nums[i];
        while(count<nums.length) {

            int index = (i+k)%(nums.length-1);
            int temp2 = nums[index];
           nums[index] = temp;
           i =i+k;
           System.out.println("i : "+ i);
           temp = temp2;
          count++;
        }
    }
}
