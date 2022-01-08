package com.prolearning.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionLambaExpression {
    public static void main(String args[]){
        System.out.println("********************LambdaExpression****************");
        Comparator<Integer> c = (Integer a, Integer b)-> {
            if(a==b) return 0;
            if(a>b) return  -1;
            return 1;
        };
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        list.sort(c);
        System.out.println("List : " + list);
        System.out.println("********************LambdaExpression****************");
    }
}
