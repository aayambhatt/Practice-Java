package DailyDSA.Intro;

import java.util.HashMap;

class TwoSumReturnValue {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println( "Indices: " + map.get(complement) + "," + i);
                System.out.println( "Values: " + complement + " + " + nums[i] + " = " + target);
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

    }
}
