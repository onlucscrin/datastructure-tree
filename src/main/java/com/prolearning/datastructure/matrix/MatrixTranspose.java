package com.prolearning.datastructure.matrix;

public class MatrixTranspose {
    public static void main(String args[]){
        System.out.println("*****MatrixTranspose*****");
        System.out.println("*****MatrixTranspose*****");
    }
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("row : " + row + " , col :" +col);
        int[][] result = new int[col][row];
        for(int i=0;i< matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
