package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,15,17,34,35,54,63,73,82,85};
        int tar=35;
        int ans=Searching(arr,tar);
        System.out.println(ans);
    }
    static int Searching(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
