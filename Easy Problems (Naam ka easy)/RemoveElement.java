
//==>> Q..
// https://leetcode.com/problems/remove-element


package com.srijon.LinearSearch;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; int val = 3;
//        Solution.removeElement(nums,val);
//        while (true) {
//            int index = Solution.indexOf(nums, val);
//            if(index!=-1) {
//                for (int i = 0; i < nums.length; i++) {
//                    nums[index] = -1;
//                }
//            } else if (index==-1) {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        int count = 0;
//        for (int item :nums
//             ) {
//            count+= item!=-1?+1:0;
//
//
//        }
//        System.out.println(count);
        System.out.println(Solution.removeElement(nums,val));
        System.out.println(Arrays.toString(nums));

    }
}
class Solution {
    public static int removeElement(int[] nums, int val) {
//        int number=0;
//        while (true) {
//            for (int i = 0; i < nums.length; i++) {
//                nums[Solution.indexOf(nums,val)] = -1;
//            }
//        }
//        return number=nums.length;
        while (true) {
            int index = Solution.indexOf(nums, val);
            if(index!=-1) {
                for (int i = 0; i < nums.length; i++) {
                    nums[index] = -1;
                }
            } else if (index==-1) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        int count = 0;
        for (int item :nums
        ) {
            count+= item!=-1?+1:0;


        }
//        Integer arr = nums;

//        Arrays.sort(nums,Collections.reverseOrder());
//        System.out.println(count);
//        int[] extra=new int[count];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=-1){
//                extra[i]=nums[i];
//            }
//        }
//        System.out.println(extra)
        int[] xtra={};
        for(int k = 0;k< nums.length;k++){
            if(nums[k]!=-1){
                xtra=Solution.addX(xtra.length, xtra,nums[k]);
            }
        }
        System.out.println("xtra==>>"+Arrays.toString(xtra));
        for (int i = 0; i < xtra.length; i++) {
            nums[i]=xtra[i];
        }
        System.out.println("final num"+Arrays.toString(nums));



        return count;


    }

    public static int indexOf(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }

        }
        return -1;
    }
    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}

