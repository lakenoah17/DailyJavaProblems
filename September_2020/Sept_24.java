package September_2020;

import java.util.Arrays;

public class Sept_24 {
    //This problem was asked by Uber.
    //
    //Given an array of integers, return a new array such that each element at
    // index i of the new array is the product of all the numbers in the original
    // array except the one at i.
    //
    //For example, if our input was [1, 2, 3, 4, 5], the expected output would be
    // [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
    // be [2, 3, 6].
    //
    //Follow-up: what if you can't use division?

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 2, 1};
        System.out.println(Arrays.toString(solution1(nums1)));
        System.out.println(Arrays.toString(solution1(nums2)));
    }

    //Loops through list and in each iteration there are two for loops. Each loop
    //works on the right and left of the index multiplying all of the nums together
    //except for the one at the index i
    //Params:
    //  nums - the array of numbers to use
    //Returns: the new array with values in the array representing all of values
    //         in the original array multiplied together except for the value at
    //         the index the new value is at in the new array in the old array
    public static int[] solution1(int[] nums){
        int[] newNums = new int[nums.length];

        //Iterates through array
        for (int i = 0; i < nums.length; i++) {
            int productOfOthers = 1;

            //Loops through the numbers to the left side of the index
            for (int j = 0; j < i; j++) {
                productOfOthers *= nums[j];
            }

            //Loops through the numbers to the right side of the index
            for (int j = i+1; j < nums.length; j++) {
                productOfOthers *= nums[j];
            }

            newNums[i] = productOfOthers;
        }

        return newNums;
    }
}
