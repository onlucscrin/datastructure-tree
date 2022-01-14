package com.prolearning.datastructure.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class H1207UniqueNumberOccurrences {
    public static void main(String args[]){
        System.out.println("*******************CountDistinctElements********************");
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        boolean sum = uniqueOccurrences(arr);
        System.out.println("Result : "+ sum);
        System.out.println("*******************CountDistinctElements********************");
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element: arr){
            Integer count = map.get(element);
            count = (count == null ? 1 : count+1);
            map.put(element, count);
        }
        HashSet values = new HashSet(map.values());
        return values.size()==map.values().size();
    }

}
