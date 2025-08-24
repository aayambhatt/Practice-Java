package DailyDSA.Intro;

import java.util.HashSet;

public class SumToTenOptimized {

    static void addToTen(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            int compliment = 10 - num;
            if(seen.contains(compliment)){
                System.out.println(num + " + " + compliment +  " =  10" );
                return;
            }

            seen.add(num);
        }
        System.out.println("No pair adds up to 10");
    }

    public static void main(String[] args) {
        addToTen(new int[]{2, 4, 7, 6});
        addToTen(new int[]{2, 4, 7, 5});
    }
}
