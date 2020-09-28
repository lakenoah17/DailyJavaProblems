package September_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sept_26 {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Stripe.
    //
    //Given an array of integers, find the first missing positive integer
    //in linear time and constant space. In other words, find the lowest
    //positive integer that does not exist in the array. The array can
    //contain duplicates and negative numbers as well.
    //
    //For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
    //
    //You can modify the input array in-place.
    public static void main(String[] args){
        int[] nums1 = {3, 4, 2, 1, 5};
        int[] nums2 = {1, 2, 0, -8, 10, 34, 4, 1, 3};
        System.out.println(solution2(nums1));
        System.out.println(solution2(nums2));
    }

    //Doesn't use constant space or time
    public static int solution1(int[] nums){
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for (int num : nums) {
            numsList.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numsList.contains(i)){
                return i;
            }
        }

        return nums.length+1;
    }

    //Uses both constant space and time
    //Finds the lowest missing positive integer in the array and returns it
    //Params:
    //  nums - the array of numbers to search through
    //Returns: the lowest missing positive integer
    public static int solution2(int[] nums){
        int currNum;
        int nextNum;

        //Loops through the array once
        for (int i = 0; i < nums.length; i++) {

            //If the number is less than 1 it is not positive so its skipped
            //If the number is greater than the length of the array then it
            //  is not the lowest possible positive integer missing
            //If the number is equal to the index plus 1 then it is in the
            //  right position to be used to find lowest missing so it's
            //  skipped
            if(nums[i] < 1 || nums[i] > nums.length || nums[i] == i+1){
                continue;
            }

            //Sets the current number to the number at the current index
            currNum = nums[i];

            //Loops through the array until the current number is correctly
            //positioned in the array
            while(nums[currNum-1] != currNum){
                //Sets next num equal to the number at the correct position
                //for currNum and sets the correct position to the current
                //number
                nextNum = nums[currNum-1];
                nums[currNum-1] = currNum;

                //Checks if the next number is a valid number to use for
                //the solution. If it is set currNum equal to it and loop
                //again
                if (nextNum <= nums.length && nextNum >= 1){
                    currNum = nextNum;
                }
            }
        }

        //Loops through the list to see what the lowest positive integer
        //missing is
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i +1){
                return i+1;
            }
        }

        //Returns the length plus 1 as that is the only other possibility
        //if all of the nums in the list are valid.
        return nums.length+1;
    }
}
