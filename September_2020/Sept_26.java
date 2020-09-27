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
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        System.out.println(solution1(nums1));
        System.out.println(solution1(nums2));
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
}
