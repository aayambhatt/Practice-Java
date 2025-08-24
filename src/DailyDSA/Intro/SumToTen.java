package DailyDSA.Intro;

public class SumToTen {

    static boolean addTen(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j]==10){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = addTen(new int[]{2, 4, 7, 6});
        System.out.println(result);
    }

}
