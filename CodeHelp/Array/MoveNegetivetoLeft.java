package Array;

import java.util.Arrays;

public class MoveNegetivetoLeft {
    public static void main(String[] args) {
        int[] num={1,2,-3,4,-5,6};
        int start=0,target=0,end=num.length-1;
        while(target<=end){
            if(num[target]>0){
                target++;
            }else if(num[target]<0){
                swap(num,start,target);
                start++;
                target++;
            }
        }

        System.out.println(Arrays.toString(num));
    }
    public static void swap(int[] num, int start, int end) {
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
    }
}
