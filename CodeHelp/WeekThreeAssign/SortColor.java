package WeekThreeAssign;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums={1,0,2,0,0,2,1,1};

        int end=nums.length-1;
        int start=0,mid=0;

        while(mid<end){
            if(nums[mid]==0){
                swap(mid,start,nums);
                mid++;
                start++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(mid, end, nums);
                end--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int i, int j, int[] nums) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
