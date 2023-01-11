package recursion.patterns;

import java.util.Arrays;

public class Traingle {
    public static void main(String[] args) {
        int[] arr={4,3,2,23};

        fun(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void fun(int[] arr,int r,int c){
        if(r==0) return;

        if(c<r){
            if(arr[c]>arr[c+1]){
                int tmp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=tmp;
            }

            fun(arr,r,c+1);

        }else {

            fun(arr,r-1,0);

        }

    }
}
