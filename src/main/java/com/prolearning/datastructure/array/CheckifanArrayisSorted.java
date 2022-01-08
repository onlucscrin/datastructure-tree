package com.prolearning.datastructure.array;

public class CheckifanArrayisSorted {
    public static void main(String[] args){
        System.out.println("********CheckifanArrayisSorted*************************");
//        int[] arr = {1,2,3,4,5};

        int[] arr = {1,2,1,4,5};
        System.out.println("Results: "+ isArraySorted(arr));
        System.out.println("********CheckifanArrayisSorted*************************");
    }
    public static boolean isArraySorted(int[] arr){
        boolean result = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return result;
    }
}
