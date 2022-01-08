package com.prolearning.datastructure.array;


public class CheckifanArrayisSorted {
    public static void main(String args[]) {
        System.out.println("****************CheckifanArrayisSorted**********");
//        int[] inputArray = {1,2,3, 4, 5};
        int[] inputArray = {5, 12, 30, 2, 35};
        boolean result = isArraySorted(inputArray);
        System.out.println("Result :"+ result);
        System.out.println("****************CheckifanArrayisSorted**********");
    }
    public static boolean isArraySorted(int[] inputArray){
        boolean result = true;
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i-1] > inputArray[i])
                return false;
        }
        return result;
    }
}
