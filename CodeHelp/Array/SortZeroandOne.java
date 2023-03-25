package Array;

import java.util.Arrays;

public class SortZeroandOne {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1,0,0,0,1};
        int start=0;
        int end=arr.length-1;
        int i=0;
        while(start<end) {
            if(arr[i]==1){
                if(arr[end]==1){
                    end--;
                }
                swap(i,end,arr);
                end--;
            }
            if(arr[i]==0){
                swap(i, start, arr);
                start++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int i, int j,int arr[]) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}
