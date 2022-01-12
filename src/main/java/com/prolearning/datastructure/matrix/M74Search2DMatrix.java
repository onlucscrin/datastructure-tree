package com.prolearning.datastructure.matrix;

public class M74Search2DMatrix {
    public static void main(String args[]){
        System.out.println("****MatrixBoundary****");
        int arr[][] = {{1,3,5,7},
                       {10,11,16,20},
                       {23,30,34,60}};
        searchMatrix(arr, 3);
        System.out.println("****MatrixBoundary****");
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int i = 0;
        int j = matrix[0].length-1;
        System.out.println("j :" + j);
        while((i>=0 && i<=row) && (j>=0 && j<=col)){
            System.out.println(" i :" + i + ", j:" + j);
            if(matrix[i][j] == target)
            {
                System.out.println("Found at (i,j): (" + i + "," + j + ").");
                return true;
            }
            else if(target > matrix[i][j])
                i++;

            else if(target < matrix[i][j])
                j--;

        }
        System.out.println("Not found");
        return false;
    }
}
