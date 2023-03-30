package BinarySearch;

public class FindPivotElement {
    public static void main(String[] args) {
        int[] arr={1,3};

        int start=0,end=arr.length-1,ans=0;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                ans=arr[mid];
            }
             if(arr[mid-1]>arr[mid]){
                ans=arr[mid-1];
            }

            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
}
