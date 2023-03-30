package BinarySearch;

public class FirstOccerence {
    public static void main(String[] args) {
        int[] nums={1,3,4,4,4,4,6,7};
        int target=4;
        int start=0,end=nums.length-1;
        int ans=0;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
