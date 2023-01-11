package Ghosh;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr={23,43,12,3,5,61};
        System.out.println(Max(arr,2,5));
    }
    static int Max(int[] arr,int start,int end){
        int max=arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
