package October_2020;

public class Oct_1 {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Airbnb.
    //
    //Given a list of integers, write a function that returns the
    // largest sum of non-adjacent numbers. Numbers can be 0 or negative.
    //
    //For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6,
    // and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
    //
    //Follow-up: Can you do this in O(N) time and constant space?

    public static void main(String[] args){
        int[] nums1 = {2, 4, 6, 2, 5};
        int[] nums2 = {5, 1, 1, 5};
        System.out.println(solution1(nums1));
        System.out.println(solution1(nums2));
    }

    public static int solution1(int[] nums){
        int sumFirst = 0;
        int sumSecond = 0;
        int oldSumFirst;

        for (int i = 0; i < nums.length; i++) {
            oldSumFirst = sumFirst;
            sumFirst = sumSecond + nums[i];
            sumSecond = Math.max(sumSecond, oldSumFirst);
        }

        return Math.max(sumFirst,sumSecond);
    }
}
