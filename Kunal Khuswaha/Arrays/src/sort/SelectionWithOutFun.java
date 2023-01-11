package sort;

import java.util.Arrays;

public class SelectionWithOutFun {
    public static void main(String[] args) {
        int[] arr={98,65,-2,-58,87,25};
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-1-i;
                int max=0;
            for (int j = 1; j <=last; j++) {
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            int temp=arr[last];
            arr[last]=arr[max];
            arr[max]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
