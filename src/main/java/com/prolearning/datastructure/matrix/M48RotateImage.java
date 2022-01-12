package com.prolearning.datastructure.matrix;

public class M48RotateImage {
    public static void main(String args[]){
        System.out.println("****M48RotateImage****");
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        int arr[][] = {{1,2}, {3,4}, {5,6}, {7,8}};
//        int arr[][] = {{1 , 2, 3, 4}};
        rotate(arr);
        System.out.println("****M48RotateImage****");
    }

    public static void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length;i++) {
            for(int j=i;j<matrix[i].length;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int i=0;i<matrix.length/2;i++) {
            int row = matrix.length;
            for(int j=0;j<matrix[i].length;j++){
                int temp = matrix[row-i-1][i];
                matrix[row-1-i][i] = matrix[i][j];
                matrix[row-1-i][j] = temp;
            }
        }
//        return matrix;
    }
}
