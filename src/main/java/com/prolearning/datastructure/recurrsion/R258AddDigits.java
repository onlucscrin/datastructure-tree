package com.prolearning.datastructure.recurrsion;

public class R258AddDigits {
    public static void main(String args[]){
        System.out.println("******************Palindrome***********");
        int input = 987;
        System.out.println(input);
        System.out.println("R258AddDigits : " + addDigits(input));
        System.out.println("******************Palindrome***********");
    }
    public static int addDigits(int num) {
        if(num<10)
            return num;
        int value = num%10 + addDigits(num/10);
        if(value > 10)
            return addDigits(value);
        return value;
    }
}
