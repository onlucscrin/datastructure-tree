package com.prolearning.datastructure.hashmap;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.*;

public class H1636SortArrayIncreasingFrequency {
    public static void main(String args[]){
        System.out.println("*******************CountDistinctElements********************");
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int[] result = frequencySort(arr);
        System.out.println("Result : " + result);
        System.out.println("*******************CountDistinctElements********************");
    }
    public static int[] frequencySort(int[] nums) {
        int result[] = new int[nums.length];
        HashMap<Integer, Integer> frequecy = new HashMap<>();
        Arrays.stream(nums).forEach(n -> frequecy.put(n, frequecy.getOrDefault(n, 0) + 1));

        //  System.out.println(frequecy);
        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<Integer, List<Integer>>();
        for(Integer key: frequecy.keySet()){
            int value = frequecy.get(key);
            List list =treeMap.getOrDefault(value, new ArrayList<Integer>());
            list.add(key);
            treeMap.put(value, list);
        }
        //   System.out.println(treeMap);
        int i=0;
        for(Integer key: treeMap.keySet()){
            List<Integer> list = treeMap.get(key);
            if(list.size()>0)
                list.sort(Collections.reverseOrder());
            for(Integer num: list) {
                for(int j=0;j<key;j++){
                    result[i++] = num;
                }
            }
        }
        return result;
    }
    public static int[] frequencySortBetter(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        Arrays.stream(nums).forEach(n -> freq.put(n, freq.getOrDefault(n, 0) + 1));
        int[] result1 = Arrays.stream(nums).boxed().sorted( (o1,o2)->{
            return freq.get(o2) != freq.get(o1) ? freq.get(o1) - freq.get(o2) : o2-o1;
        }).mapToInt(i->i).toArray();
        return result1;
    }

}
