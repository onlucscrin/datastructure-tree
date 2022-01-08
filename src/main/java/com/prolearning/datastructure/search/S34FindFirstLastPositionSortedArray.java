package com.prolearning.datastructure.search;

public class S34FindFirstLastPositionSortedArray {
    public static void main(String args[]){
        System.out.println("****S34FindFirstLastPositionSortedArray****");
        int[] nums= {2,2};
        searchRange(nums, 2);
        System.out.println("****S34FindFirstLastPositionSortedArray****");
    }
    public static int[] searchRange(int[] nums, int target) {
        Integer[] result = new Integer[2];
        int low = 0;
        int high = nums.length-1;
        int midTemp = 0;
        int midHight =0;
        int midLow = 0;
        boolean temp = true;
        while(low <= high) {
            int mid = (high-low)/2 + low;
            // System.out.println("mid:  " + mid +", high :" + high + ", low: "+ low);

            if(target > nums[mid] )
                low = mid+1;

            else if (target < nums[mid])
                high = mid-1;

            if(target == nums[mid])
            {
                if(result[0]==null) {
                    if (mid>0 && nums[mid - 1] == target) {
                        if(temp) {
                            midTemp = mid;
                            midHight = high;
                            temp=!temp;
                        }
                        high = mid - 1;
                    } else  {
                        //     System.out.println("First occurence : " + mid);
                        result[0] = mid;
                        low = midTemp ;
                        high = midHight;
                        //  System.out.println("final :  mid:  " + midTemp +", high :" + high + ", low: "+ low);
                    }
                }
                else {
                    // System.out.println("final :  mid:  " + mid +", high :" + high + ", low: "+ low);
                    if ((mid < nums.length-1) && nums[mid + 1] == target ) {

                        low = mid + 1;
                    }
                    else  {
                        System.out.println("Last occurence : " + mid);
                        result[1] = mid;
                        break;
                    }
                }

            }

            System.out.println("final :  mid:  " + mid +", high :" + high + ", low: "+ low);

        }
        //    System.out.println("result []  " + result[0 ]+" result " + result[1]);
//        return {};
        // if(nums[low]==target)  System.out.println("rrrrr   low : " + nums[low]);
        if(result[0]!=null)
        {
            if(result[1]==null) {
                int temp1[] = {result[0], low};
                return temp1;
            }
            else {
                int temp1[] = {result[0], result[1]};
                return temp1;
            }
        }
        return new int[]{-1,-1};
    }
}
