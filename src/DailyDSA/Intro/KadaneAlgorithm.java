package DailyDSA.Intro;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int res = maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}
