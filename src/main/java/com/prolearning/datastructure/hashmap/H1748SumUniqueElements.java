package com.prolearning.datastructure.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class H1748SumUniqueElements {
    public static void main(String args[]){
        System.out.println("*******************CountDistinctElements********************");
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int sum = sumOfUnique(arr);
        System.out.println("Result : "+ sum);
        System.out.println("*******************CountDistinctElements********************");
    }
    public static int sumOfUnique(int[] nums) {
        int sum= 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            Integer size = map.get((Integer)num);
            size = (size==null ? size=1 :size+1);
            map.put(num, size);
            if(size == 1)
                sum +=num;
            else if(size == 2)
                sum -=num;
        }
        return sum;
    }
}
