package com.prolearning.datastructure.matrix;

public class SpiralPattern {
    public static void main(String args[]){
        System.out.println("****SpiralMatrix****");
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printSpiralPattern(arr);
        System.out.println("****SpiralMatrix****");
    }
    public static void printSpiralPattern(int nums[][]) {

        for(int i=0;i<nums.length;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.println("------printSpiralPattern -------- :" + nums[i][j]);
                }
            }
            else{
                    for (int j = nums[i].length-1; j >= 0; j--) {
                        System.out.println("------printSpiralPattern -------- :" + nums[i][j]);
                    }
            }
        }
    }
}
