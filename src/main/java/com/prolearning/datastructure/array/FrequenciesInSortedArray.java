package com.prolearning.datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesInSortedArray {
    public static void main(String args[]){
        System.out.println("***************FrequenciesInSortedArray******************");
        int[] nums={1,1,2,2,2,3};
        int result[] = increasingFrequency(nums);
        for(int num:result)
            System.out.println("--"+ num);
        System.out.println("***************FrequenciesInSortedArray******************");
    }
    public static int[] increasingFrequency(int[] nums){
        int prev = nums[0];
        int result[] = new int[nums.length];
        HashMap<Integer, List<Integer>> freqList = new HashMap<>();
        int count = 1;
        for(int i=1;i<nums.length;i++){
            System.out.println(nums[i]+ "---" + prev);
            if(nums[i]!=prev ){
                System.out.println(count+ "- hashs--" + prev);
                List<Integer> array = freqList.get(count);
                if(array==null)
                    array= new ArrayList();
                array.add(prev);
                freqList.put(count, array);
                prev = nums[i];
                count=1;
                if(i==nums.length-1){
                    array = freqList.get(count);
                    if(array==null)
                        array= new ArrayList();
                    array.add(prev);
                    freqList.put(count, array);
                }
            }
            else{
                count++;
            }

        }
        count=0;
        for(int key:freqList.keySet()){
            List<Integer> values = freqList.get(key);
            System.out.print(key);
            for(int value: values){
                for(int i=0;i<key;i++)
                    result[count++] = value;
            }
        }
        return result;
    }
}
