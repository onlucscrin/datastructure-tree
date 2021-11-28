package com.prolearning.datastructure.string;

public class S1832CheckSentenceIsPangram {
    public static void main(String args[]){
        System.out.println("********************* S1832CheckSentenceIsPangram Start *********************");
        System.out.println(" Anagram : " + checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println("********************* S1832CheckSentenceIsPangram End *********************");
    }
    public static boolean checkIfPangram(String sentence) {
        int[] alphabets = new int[26];
        if(sentence.length()<26)
            return false;
        for(int i=0;i<sentence.length();i++){
            int ch = sentence.charAt(i) - 'a';
            alphabets[ch]++;
        }
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]<=0)
                return false;
        }
        return true;
    }
}
