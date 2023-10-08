package BinarySearch;

public class TotalNoOfOccerence {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,3,3,3,3,4,4,4,4,4,5,6,7};
        int target= 4;
        int end=nums.length-1;
        int start=0;

        int totalOccerence=lastOccer(nums,target,start,end)-firstOccer(nums,target,start,end)+1;
        System.out.println(firstOccer(nums,target,start,end));
        System.out.println(lastOccer(nums,target,start,end));
        System.out.println(totalOccerence);

    }

    public static int firstOccer(int[] nums,int target,int start,int end) {
        int result=0;
         while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                result=mid;
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
         }

        return result;
    }
    public static int lastOccer(int[] nums,int target,int start,int end) {
        int result=0;
         while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                result=mid;
                start=mid+1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
         }

        return result;
    }
}
