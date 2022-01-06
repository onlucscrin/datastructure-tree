package com.prolearning.datastructure.search;

import java.io.CharArrayReader;

public class A702SearchSortedInfiniteSizeArray {
    public static void main(String args[]){
       System.out.println("******A702SearchSortedInfiniteSizeArray******");
       int[] input = {1,2,3,4,5,6,7,8,9};
       System.out.println("searched : " + search(input, 2));
       System.out.println("******A702SearchSortedInfiniteSizeArray******");
    }
    public static int search(int[] reader, int target) {
        int l = 0, h =1;
        while(true){
            System.out.println("l : "+l + ", h:" + h);
            if( reader[h] < target) {
                l = h;
                h = h*2;
            }
            else
                return binarySearch(l,h,target,reader);
        }
    }
    public static int binarySearch(int low, int high, int target, int[] reader){
        System.out.println("binary l : "+low + ", h:" + high);
        while(low<=high){
            int mid = ((high -low)/2 )+ low;
            System.out.println("mid : " + mid + ", val "+ reader[mid]);
            if(reader[mid] == target)
                return mid;
            else if(reader[mid] < target)
               low = mid+1;
            else if(reader[mid] > target)
                high = mid-1;
        }
        System.out.println("binary l : "+low + ", h:" + high);
        if(reader[low] ==target)
            return low;
        return -1;
    }
}
