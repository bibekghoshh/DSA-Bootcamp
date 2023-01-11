package Search;

public class CeilingOfANum {
    public static void main(String[] args) {
        int[] arr={12,23,54,56,57,86,88,445,677,678};
        int target=54;
        System.out.println(CeilNum(arr,target));
    }
    static int CeilNum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int a=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
