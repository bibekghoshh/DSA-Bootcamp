package WeekThreeAssign;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            int index=Math.abs(nums[i]);
            if(nums[index]<0){
                ans=index;
                break;
            }
             nums[index]*=-1;   
            
        }

        System.out.println(ans);
    //     Arrays.sort(nums);
    //     int dup=0;
    // for (int i = 1; i < nums.length; i++) {
    //     if(nums[i]==nums[i-1]){
    //         dup=nums[i];
    //     }
    // }
    //     System.out.println(dup);
    //     System.out.println(Arrays.toString(nums));

    //     int d=0;
    // for (int i = 0; i < nums.length; i++) {
    //     for (int j = i+1; j < nums.length; j++) {
    //         if(nums[i]==nums[j]){
    //             d=nums[i];
    //         }
    //     }
    // }
    // System.out.println(d);
    }
}
