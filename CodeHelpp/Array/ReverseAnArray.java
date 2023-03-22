package Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int rev[]={1,2,3,4,5,6,7,8,9};
        
        int start=0;
        int end=rev.length-1;

        while (start<end) {
            swap(start,end,rev);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(rev));
    }

    public static void swap(int i, int j, int[] rev) {
       int temp=rev[i];
       rev[i]=rev[j];
       rev[j]=temp;
    }
}
