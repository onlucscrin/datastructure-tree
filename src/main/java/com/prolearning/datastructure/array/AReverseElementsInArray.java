package com.prolearning.datastructure.array;

public class AReverseElementsInArray {
    public static void main(String args[]){
        System.out.println("**************AReverseElementsInArray**************");
        Integer arr[] = {1,2,3,4};
//        int arr[] = {1,2,3,4,5};
        reverseElenmentsArray(arr);
        System.out.println("Reversed array : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println("**************AReverseElementsInArray**************");
    }
    public static Integer[] reverseElenmentsArray(Integer[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length - i -1] = temp;
        }
        return arr;
    }
}
