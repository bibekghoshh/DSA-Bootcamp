package sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={45,43,23,65,77};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swaped;
        for (int i = 0; i < arr.length; i++) {
        swaped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                    swaped=true;
                }
            }
            if(swaped==false){
                break;
            }
        }

    }
}
