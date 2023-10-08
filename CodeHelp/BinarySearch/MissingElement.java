package BinarySearch;

public class MissingElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,11,12};
        int end=nums.length-1;
        int start=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==mid+1){
                start=mid+1;
                if(nums[mid+1]-nums[mid]==2){
                    System.out.println(mid+2);
                }
            }else{
                end=mid-1;
            }
        }
    }
}
