package Ghosh;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={34,23,43,64,78,6,3,233,44};
        int target=441;
        int ans=linearS(arr,target);
        System.out.println(ans);
    }
    static int linearS(int[] a,int t){
        if(a.length==0){
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if(t==a[i]){
                return i;
            }
        }
        return -1;
    }
}
