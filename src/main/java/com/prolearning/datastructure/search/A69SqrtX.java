package com.prolearning.datastructure.search;

public class A69SqrtX {
    public static void main(String args[]){

        System.out.println("******A69SqrtX******");
        System.out.println("square root : " + mySqrt(8));
        System.out.println("******A69SqrtX******");
    }
    public static int mySqrt(int x) {
        int low = 0;
        int high=x;
        while(low<=high){
            int mid = ((high-low)/2 )+ low;
            int value = mid*mid;
            if(value == x)
                return mid;
            if(value > x)
                high = mid -1;
            if(value < x)
                low = mid + 1;

        }
        System.out.println("high : " + high + ", low "+ low);
        return low;
    }
}
