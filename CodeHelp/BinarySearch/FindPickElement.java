package BinarySearch;

public class FindPickElement {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,12,6,5,3,1};

        int start=0,end=arr.length-1,ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
                ans=mid;
            }
        }
        System.out.println(arr[ans]);
    }
}
