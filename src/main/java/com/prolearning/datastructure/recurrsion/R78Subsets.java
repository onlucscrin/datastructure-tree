package com.prolearning.datastructure.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R78Subsets {
    public static void main(String args[]){
        System.out.println("******************R78Subsets***********");
       int[] input = {9, 8, 7};
  //      int[] input = {9};
//        int[] input = {1, 2};
        System.out.println(input);
        System.out.println("R78Subsets : " + subsets(input));
        System.out.println("******************R78Subsets***********");
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetRecursive(  new ArrayList<>(), nums, 0);
        return list;
    }
    public static void subsetRecursive(  List<Integer> str , int[] nums, int index) {
        if(index >= nums.length) {
            System.out.println("R78Subsets : " + str);
            return;
        }
        System.out.println(index);

        subsetRecursive(str, nums, index+1);
        List<Integer> str2 = new ArrayList<>();
        str2.add(nums[index]);
        str2.addAll(str);
        subsetRecursive(str2, nums, index+1);

        return ;
    }
//    Not working
//    public static List<List<Integer>> subsetRecursive(int[] nums, int mixIndex) {
//        List<List<Integer>> subset = new ArrayList<>();
//        if(mixIndex>=nums.length) {
//            return subset;
//        }
//        //add single digits
//        List<Integer> array = new ArrayList<>();
//        array.add(nums[mixIndex]);
//        if(array.size()>0)
//            subset.add(array);
//
//        //add permutations of digits
//        int num =0;
//        List<Integer> nextList = new ArrayList<>();
//        for(int i=0;i<nums.length && nums.length>2;i++){
//            if(i==mixIndex)
//                continue;
//            nextList.add(nums[i]);
//        }
//        if(nextList.size()>0)
//            subset.add(nextList);
//
//        List<List<Integer>> subsubList =  subsetRecursive(nums, mixIndex+1);
//        if(subsubList.size()>0)
//            subset.addAll(subsubList);
//        return subset;
//    }
}
