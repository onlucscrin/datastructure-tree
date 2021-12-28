package com.prolearning.datastructure.array;

public class AMaximumOddEvenSubarray {
    public static void main(String args[]){
        System.out.println("*****A485MaxConsecutiveOnes*****");

        System.out.println("*****A485MaxConsecutiveOnes*****");
    }
    public static int maxTurbulenceSize(int[] arr) {
        if(arr.length==0)
            return 0;
        boolean nextOdd = false;

        //if current is even next should be odd
        if(arr[0]%2 == 0)
            nextOdd = true;

        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            System.out.println("Current even : " + (arr[i]%2==0) + ", expected even : "+ !nextOdd + ", Count:"+ count);
            if((nextOdd && (arr[i]%2!=0)) || (!nextOdd && (arr[i]%2==0))) {
                count++;
                nextOdd = !nextOdd;
            }
            else if((nextOdd && (arr[i]%2==0)) || (!nextOdd && (arr[i]%2!=0))){
                maxCount = Math.max(count, maxCount);
                count=1;
            }
        }
        return maxCount = Math.max(count, maxCount);

    }
}
