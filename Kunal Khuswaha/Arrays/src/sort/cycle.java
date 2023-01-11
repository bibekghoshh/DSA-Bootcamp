package sort;

import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,6,1};
        for(int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length; i++) {
                int a = arr[j];
                swap(arr, j, a - 1);
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
