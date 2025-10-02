package DailyDSA.Intro;

public class MaxSubarrayBrute {
    public static void main(String[] args) {
        int res = maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i<nums.length ; i++){
            int currSum = 0;
            for(int j = i ; j<nums.length ; j++){
                currSum += nums[j];
                if(currSum > maxSum){
                    maxSum = currSum;
                }

            }
        }

        return maxSum;

    }
}
