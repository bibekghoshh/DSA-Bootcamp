package sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {

        int[] arr={8,9,2,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);
        }

    }
     static void swap(int[] arr, int last, int maxIndex) {
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
    return max;
    }
}

