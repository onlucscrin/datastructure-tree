package com.prolearning.datastructure.string;

public class S242ValidAnagram {
    public static void main(String args[]){
        System.out.println("IsAnagram here...");
        System.out.println("IsAnagram : "+ isAnagram("abd", "dca") );
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] present = new int[26];
        for(int i=0;i< s.length();i++){
            int chL =  s.charAt(i) - 'a';
            int chR =  t.charAt(i) - 'a';
            present[chL]++;
            present[chR]--;
        }
        for(int i=0;i<present.length;i++){
            if(present[i]!=0)
                return false;
        }
        return true;
    }
}
