package com.prolearning.datastructure.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequenciesOfArrayElements {
    public static void main(String args[]){
        System.out.println("*******************CountDistinctElements********************");
        int arr[] = new int[]{27, 15, 16, 27, 27, 28, 15};
        countFreq(arr, arr.length);
        System.out.println("*******************CountDistinctElements********************");
    }
    static void countFreq(int arr[], int n){
        HashMap<Integer, Integer> freq = new LinkedHashMap<>();
        Arrays.stream(arr).boxed().forEach( num -> {freq.put(num, freq.getOrDefault(num, 0)+1); });
        for(int key: freq.keySet()){
            System.out.println(key + "--"+ freq.get(key));
        }
    }
}
