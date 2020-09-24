package September_2020;

import java.util.HashSet;

public class Sept_23 {
    //This problem was recently asked by Google.
    //
    //Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
    //
    //For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    //
    //Bonus: Can you do this in one pass?

    public static void main(String[] args){
        int[] nums = {10, 15, 3, 7};
        System.out.println(solution2(nums, 17));
        System.out.println(solution2(nums, 25));
        System.out.println(solution2(nums, 11));
    }

    //Checks all possibilities of adding nums together
    //Params:
    //  nums - array of numbers that can be added together
    //  numToAddTo - sum that two numbers in the array must equal
    //Returns: whether two numbers in array add together to equal
    //the specified sum or not
    public static boolean solution1(int[] nums, int numToAddTo){
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == numToAddTo){
                    return true;
                }
            }
        }
        return false;
    }

    //Checks all possibilities of adding nums together
    //Params:
    //  nums - array of numbers that can be added together
    //  numToAddTo - sum that two numbers in the array must equal
    //Returns: whether two numbers in array add together to equal
    //the specified sum or not
    public static boolean solution2(int[] nums, int numToAddTo){
        HashSet<Integer> numsHash = new HashSet<>();
        for (int num : nums){
            if (numsHash.contains(numToAddTo - num)){
                return true;
            }
            numsHash.add(num);
        }
        return false;
    }
}
