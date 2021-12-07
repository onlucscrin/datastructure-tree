package com.prolearning.datastructure.recurrsion;

public class RodCuttingProblem {
    public static void main(String args[]){
        System.out.println("******************RodCuttingProblem***********");
//        int input = 5;
//        int a = 2, b= 5, c=1;
        int input = 5;
        int a = 4, b= 2, c=6;
        System.out.println(input);

        System.out.println("R258AddDigits : " + maxCuts(input, a, b, c));
        System.out.println("******************RodCuttingProblem***********");
    }
    public static int maxCuts(int input, int a, int b, int c){
        if(input==0)
            return 0;
        if(input < 0)
            return -1;
        int acuts = 0,bcuts=0,ccuts=0;

        if(input>=a)
           acuts = 1 + maxCuts(input-a, a,b,c);
        if(input>=b)
            bcuts = 1 + maxCuts(input-b, a,b,c);
        if(input>=c)
            ccuts = 1 + maxCuts(input-c, a,b,c);
        if(input == 0)
            return Math.max(Math.max(acuts, bcuts), ccuts);
        else
            return -1;
    }
}
