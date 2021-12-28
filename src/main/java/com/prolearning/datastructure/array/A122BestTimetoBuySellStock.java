package com.prolearning.datastructure.array;

public class A122BestTimetoBuySellStock {
    public static void main(String args[]){
        System.out.println("********MaximumDifferenceInArray*************************");
//        int[] nums = {1,2,3,4,5};
//        int nums[] = {2,1};
//        int nums[] = {7,1,5,3,6,4};
//        int nums[]={2,1,3,4};
        int nums[] = {1,5,3,8,12};
        //int[] nums = {1, 2, 3};
//        int[] nums = {3,2,1};
        System.out.println("Results: " + maxProfit(nums));
        System.out.println("********MaximumDifferenceInArray*************************");
    }
    public static int maxProfit(int[] prices){
        int result = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i], min);
            if(i == prices.length-1 || prices[i] > prices[i+1])
            {
                result = (prices[i] - min )+ result;
                System.out.println("here");
                min = Integer.MAX_VALUE;
            }
        }
        return result;
    }
}
