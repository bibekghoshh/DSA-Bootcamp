package Ghosh;

import java.util.Arrays;

public class SwapingArrayElement {
    public static void main(String[] args) {
        int [] ar={23,12,54,67,45};
        swap(ar,0,4);
        System.out.println(Arrays.toString(ar));
    }

     static void swap(int[] ar,int first,int sec) {
        int temp=ar[first];
        ar[first]=ar[sec];
        ar[sec]=temp;
    }
}
