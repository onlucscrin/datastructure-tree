package com.prolearning.datastructure.string;

public class S1816TruncateSentence {
    public static void main(String args[]){
        System.out.println("*********************S1816TruncateSentence*********************");
        System.out.println("*********************S1816TruncateSentence*********************");
    }
    public static String truncateSentence(String s, int k) {
        int count =0;
        int index =s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ')
                count++;
            if(count == k)
            {
                index =i;
                break;
            }
        }
        return s.substring(0, index);
    }
}
