package com.prolearning.datastructure.hashmap;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String args[]){
        System.out.println("*******************CountDistinctElements********************");
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        int result = countDistinctPrimitive(arr, n);
        System.out.println("Result : "+ result);
        System.out.println("*******************CountDistinctElements********************");
    }
    public static int countDistinct(Integer arr[], int n){
        System.out.println("array : " + arr.length);
        HashSet set = new HashSet(Arrays.asList(arr));
        System.out.println("set : " + set);
        return set.size();
    }
    public static int countDistinctPrimitive(int arr[], int n){
        System.out.println("array : " + arr.length);
        HashSet set = new HashSet();
        for(int arrElement: arr){
            set.add(arrElement);
        }
        System.out.println("set : " + set);
        return set.size();
    }
}
