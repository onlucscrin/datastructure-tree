package com.prolearning.datastructure.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R78Subsets {
    public static void main(String args[]){
        System.out.println("******************R78Subsets***********");
        int[] input = {9,8,7};
        System.out.println(input);
        System.out.println("R78Subsets : " + subsets(input));
        System.out.println("******************R78Subsets***********");
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = subsetRecursive(nums, 0);
        //List<Integer> targetList = Arrays.asList(nums);
        List<Integer> nextList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            nextList.add(nums[i]);
        }
        list.add(nextList);
        return list;
    }
    public static List<List<Integer>> subsetRecursive(int[] nums, int mixIndex) {
        List<List<Integer>> subset = new ArrayList<>();
        if(mixIndex>=nums.length) {
            subset.add(new ArrayList<>());
            return subset;
        }
        List<Integer> array = new ArrayList<>();
        array.add(nums[mixIndex]);
        int num =0;
        List<Integer> nextList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==mixIndex)
                continue;
            nextList.add(nums[i]);
        }

        subset.add(array);

        subset.add(nextList);
        subset.addAll(subsetRecursive(nums, mixIndex+1));
        return subset;
    }
}
