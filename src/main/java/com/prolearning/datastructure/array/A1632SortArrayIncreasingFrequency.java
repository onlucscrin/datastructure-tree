package com.prolearning.datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class A1632SortArrayIncreasingFrequency {
    public static void main(String args[]){
        System.out.println("***************A1632SortArrayIncreasingFrequency******************");
        System.out.println("***************A1632SortArrayIncreasingFrequency******************");
    }
    class node implements Comparable {
        Integer value;
        Integer count;

        @Override
        public int compareTo(Object o) {
            node n = (node)o;
            int value = this.count.compareTo(n.count);
            if(value==0)
                value = this.value.compareTo(value);
            return value;
        }

    }
    public static int[] increasingFrequency(int[] nums){
        int result[] = new int[nums.length];
        List<node> nodeList = new ArrayList<>();
        HashMap<Integer, Integer> freqList = new HashMap<>();
        HashMap<Integer, List<Integer>> sortList = new HashMap<>();
         for(int i=1;i<nums.length;i++){
           // Integer freq = nodeList.getnums[i]);
//            if(freq ==null)
//                freq = 1;
//            freqList.put(nums[i], freq);
        }
        for(int elem: freqList.keySet()){
            int count = freqList.get(elem);
            List<Integer> ct= sortList.get(count);
            if(ct==null){
                ct = new ArrayList<>();
            }
            ct.add(elem);
            sortList.put(count, ct);
        }
        int count=0;
        for(int key: sortList.keySet()){
            List<Integer> values = sortList.get(key);
            for(int value: values){
                for(int i=0;i<key;i++)
                    result[count++] = value;
            }
        }
        return result;
    }
}

