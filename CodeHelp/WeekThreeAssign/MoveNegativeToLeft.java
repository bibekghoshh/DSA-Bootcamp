package WeekThreeAssign;

import java.util.Arrays;

public class MoveNegativeToLeft {
    public static void main(String[] args) {
        // int[] arr={1,2,-3,4,-5,6};
        int[] arr={-1,2,-3,4,-5,6,0,-5,34,-7};

        // int start=0,i=0;

        // while(i<arr.length){
        //     if(arr[i]<0){
        //         swap(start,i,arr);
        //         start++;
        //     }
        //     i++;
        // }

        // Dutch National Flag algo (this is more optomize)

        int start=0,end=arr.length-1;

        while(start<end){
            if (arr[start]<0) {
                start++;
            }else if(arr[end]>0){
                end--;
            }else{
                swap(start, end, arr);
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int i, int j, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
