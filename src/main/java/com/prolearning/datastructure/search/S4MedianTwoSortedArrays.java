package com.prolearning.datastructure.search;

public class S4MedianTwoSortedArrays {
    public static void main(String args[]){
        System.out.println("***S4MedianTwoSortedArrays**");
        int num1[] = { 0,0,0,0, 0};
        int num2[] = {-1, 0,0,0,0,1};
        double result = findMedianSortedArrays(num1, num2);
                System.out.println("Result : " +  result);
        System.out.println("***S4MedianTwoSortedArrays**");
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int median = (nums1.length + nums2.length)/2;
        int medianva = 0;
        int medianva2 = 0;
        for(int k=0, j=0,i=0; k<=median ;k++)
        {
            if(i<= nums1.length-1 && j <= nums2.length-1 && nums1[i] <= nums2[j]) {
                medianva2 = medianva;
                medianva = nums1[i];
                i++;
            }
            else if(i<= nums1.length-1 && j <= nums2.length-1 && nums1[i] > nums2[j]) {
                medianva2 = medianva;
                medianva = nums2[j];
                j++;
            }
            else if(i<= nums1.length-1 && j > nums2.length-1) {
                medianva2 = medianva;
                medianva = nums1[i];
                i++;
            }
            else if(i> nums1.length-1 && j <= nums2.length-1 ) {
                medianva2 = medianva;
                medianva = nums2[j];
                j++;
            }
        }
        System.out.println("Median: " + (median) + " , First :" + medianva2 + ", Second: " + medianva);
        if((nums1.length + nums2.length)>=2 && ((nums1.length + nums2.length)%2)==0)
            return ((double) medianva+medianva2)/2;
        return medianva;
    }


//    public static double findMedianSortedArraysLog(int[] nums1, int[] nums2) {
//        int median = (nums1.length + nums2.length)/2;
//        int firstIndex = nums1.length/1;
//        int secondIndex = nums2.length/2;
//        while(firstIndex<){
//
//        }
//    }

}
