package com.prolearning.datastructure.array;

public class A1752CheckifArraySortedRotated {
    public static void main(String args[]){
        System.out.println("********CheckifanArrayisSorted*************************");
//        int[] arr = {1,2,3,4,5};
//        int arr[] = {2,1};
//        int arr[]={2,1,3,4};
        int[] arr = {1,2,3};
        System.out.println("Results: "+ isArrayRotationSorted(arr));
        System.out.println("********CheckifanArrayisSorted*************************");
    }
    public static boolean isArrayRotationSorted(int[] arr){
        boolean result = true;
        boolean oneTimePass = true;
        for(int i=0;i<arr.length;i++){

            System.out.println("arr[i] : " + arr[i]);
            System.out.println("arr[(i+1)%arr.length] : " + arr[(i+1)%arr.length]);
              if(arr[i] > arr[(i+1)%arr.length]){
                if( oneTimePass)
                    oneTimePass = false;
                else
                    return false;
                System.out.println("inside here ...");
            }
        }
        return result;
    }
}
