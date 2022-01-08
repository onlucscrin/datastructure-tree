package com.prolearning.datastructure.array;

public class ALeaderInArray {
    public static void main(String args[]) {
        System.out.println("********CheckifanArrayisSorted*************************");
//        int[] nums = {1,2,3,4,5};
//        int nums[] = {2,1};
//        int nums[]={2,1,3,4};
        int[] nums = {1, 2, 3};
//        int[] nums = {3,2,1};
        System.out.println("Results: ");
        int[] leaders = isLeaderInArray(nums);
        for(int i=0;i<leaders.length;i++){
            System.out.print("-- "+ leaders[i]);
        }
        leaders = reverseArray(leaders);
        for(int i=0;i<leaders.length;i++){
            System.out.print("-- "+ leaders[i]);
        }
        System.out.println("********CheckifanArrayisSorted*************************");
    }
    public static int[] isLeaderInArray(int[] arr){
        int maxElem = Integer.MIN_VALUE;
        int[] leaders = new int[arr.length];
        for(int i=arr.length-1, count=0;i>=0;i--){
            if(arr[i] > maxElem) {
                leaders[count] = arr[i];
                count++;
                maxElem = arr[i];
            }
        }
        return leaders;
    }

    public static int[] reverseArray(int[] nums){
        for(int i=0;i<nums.length/2;i++){
            System.out.println(nums[i]);
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        return nums;
    }
}
