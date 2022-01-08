package com.prolearning.datastructure.matrix;

public class MatrixBoundary {
    public static void main(String args[]){
        System.out.println("****MatrixBoundary****");
//        int arr[][] = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
//        int arr[][] = {{1,2}, {3,4}, {5,6}, {7,8}};
        int arr[][] = {{1 , 2, 3, 4}};
        printSpiralMatrix(arr);
        System.out.println("****MatrixBoundary****");
    }
    public static void printSpiralMatrix(int nums[][]) {
        if(nums.length==1) {
            for (int i = 0; i < nums[0].length; i++) {
                System.out.println("--------" + nums[0][i]);
            }
        }
        else if(nums[nums.length-1].length ==1) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println("--------" + nums[j][nums[j].length - 1]);
            }
        } else {
            for (int i = 0; i < nums[0].length; i++) {
                System.out.println("--------" + nums[0][i]);
            }
            for (int j = 1; j < nums.length; j++) {
                System.out.println("--------" + nums[j][nums[j].length - 1]);
            }
            for (int i = nums[nums.length - 1].length - 2; i >= 0; i--) {
                System.out.println("--------" + nums[nums.length - 1][i]);
            }
            for (int j = nums.length - 2; j >= 1; j--) {
                System.out.println("--------" + nums[j][0]);
            }
        }
    }
}
