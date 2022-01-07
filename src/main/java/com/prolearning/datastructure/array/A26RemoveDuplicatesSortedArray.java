package com.prolearning.datastructure.array;

public class A26RemoveDuplicatesSortedArray {
    public static void main(String args[]){
        System.out.println("***************A26RemoveDuplicatesSortedArray***************");
        int arr[] = {1,2,2,3,4,5};
        removeDuplicates(arr);

        System.out.println("***************A26RemoveDuplicatesSortedArray***************");
    }
    public static void removeDuplicates(int[] nums){

        for(int cur=0, next=1;next<nums.length;  next++) {
            System.out.println("cur" + cur + ", next : "+ next);
            if(nums[cur]==nums[next]){
                //do not increase cur

            }
            else
            {

                if(cur+1 != next)
                {
                    nums[cur+1] = nums[next];
                    System.out.println("cur elem" + nums[cur] + ", next elem: "+ nums[next]);
                    cur++;
                }else
                    cur++;
            }

        }
        System.out.println("RevedDuplicates ...");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

//    int cur=0;
//             for(int next=1;next<nums.length;  next++) {
//        System.out.println("cur" + cur + ", next : "+ next);
//        if(nums[cur]!=nums[next]){
//            if(cur+1 != next)
//                nums[cur+1] = nums[next];
//            cur++;
//        }
//
//    }
//        return cur+1;
}
