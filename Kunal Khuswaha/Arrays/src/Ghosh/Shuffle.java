package Ghosh;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {

        int[] nums={2,3,4,5,6,7};
        int n=3;
        int[] x=new int[n];
        int[] y=new int[n];

        for(int i=0;i<n;i++){
            x[i]=nums[i];
            y[i]=nums[n+i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));


    }
}
