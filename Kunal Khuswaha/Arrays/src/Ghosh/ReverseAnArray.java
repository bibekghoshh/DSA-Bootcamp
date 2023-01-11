package Ghosh;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={3,54,76,98,67,34,4};
        int len=arr.length-1;
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,len);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int start,int end){
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
