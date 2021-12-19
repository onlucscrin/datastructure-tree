package com.prolearning.datastructure.array;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class A414ThirdMaximumNumber {
    public static void main(String args[]){
        System.out.println("******************A414ThirdMaximumNumber***********");
//        int[] input = {};
//        int[] input = {9, 8, 7};
        int[] input = {5, 8 , 20 , 10};
        int result = findThirdMaximumNumber(input);
        System.out.println("Largest No :- " + result);
        System.out.println("******************A414ThirdMaximumNumber***********");
    }
    public static int findThirdMaximumNumber(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            if(set.size()>3)
                set.remove(Collections.min(set));
        }
        System.out.println(set.size());
        if(set.size() == 3)
            return Collections.min(set);
        return Collections.max(set);
    }
}
