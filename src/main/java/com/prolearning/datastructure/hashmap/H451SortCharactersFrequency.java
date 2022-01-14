package com.prolearning.datastructure.hashmap;

import java.util.HashMap;
import java.util.stream.Stream;

public class H451SortCharactersFrequency {
    public static void main(String args[]){
        System.out.println("*******************CountDistinctElements********************");
        String s = "treeeee";
        String result = frequencySort(s);
        System.out.println("Result : "+ result);
        System.out.println("*******************CountDistinctElements********************");
    }
    public static String frequencySort(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        str.chars().forEach( ch -> {
            map.put(( ch + ""), map.getOrDefault(ch+"", 0)+1);
        });
        System.out.println(map);
         str.chars().boxed().sorted((sl, sr) -> {

            return map.get((sl+"")) - map.get((sr+""));
        }).map( e -> {
            int val = e;
            char ch = (char)val;
            System.out.println( "String  : " + ch+ "");
            return e;
        }).toArray();
//        System.out.println(res);
        return str;
    }
}
