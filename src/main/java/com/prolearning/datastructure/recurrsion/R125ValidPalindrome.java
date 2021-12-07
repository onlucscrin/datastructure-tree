package com.prolearning.datastructure.recurrsion;

public class R125ValidPalindrome {
    public static void main(String args[]){
        System.out.println("******************Palindrome***********");
        String input = "A man, a plan, a canal: Panama";
        System.out.println(input.length());
        System.out.println("IsPalindrome : " + isPalindrome(input.toLowerCase(), 0, input.length()-1));
        System.out.println("******************Palindrome***********");
    }
    public static boolean isPalindrome(String input, int start, int end) {
        if(start >= end)
            return true;
        while((start <= input.length()-1) && !Character.isLetterOrDigit(input.charAt(start))) {
            start = start + 1;

        }
        if(start >= end)
            return true;
        while((end>=0) && !Character.isLetterOrDigit(input.charAt(end)) )  {
            end = end - 1;
        }

        if(input.charAt(start)!=input.charAt(end))
            return false;
        else
            return isPalindrome(input, start+1, end-1);
    }
}
