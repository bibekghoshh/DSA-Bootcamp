package BinarySearch;

public class RotetedSearch {
    public static void main(String[] args) {
        int[] nums={3,4,5,6,7,1,2};
        int target=2;

        int pivotIndex=FindPivot(nums);

        // System.out.println(pivotIndex);

        if(target>=nums[0] && target<=nums[pivotIndex]){
            int ans=BinarySearch(nums,target,0,pivotIndex);
            System.out.println(ans);
        }
        if(target>=nums[pivotIndex+1] && target<=nums[nums.length-1]){
            int ans=BinarySearch(nums, target, pivotIndex+1, nums.length-1);
            System.out.println(ans);
        }

    }

    private static int BinarySearch(int[] nums, int target, int start, int end) {

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    private static int FindPivot(int[] nums) {
        int start=0,end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1] && mid+1<=end){
                return mid;
            }else if(nums[mid-1]>nums[mid] && mid-1>=0){
                return mid-1;
            }

            if(nums[start]>nums[mid]){
                end=mid-1;
            }else{
                start=mid;
            }
        }

        return start;
    }
}
