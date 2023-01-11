package Search;

public class LinearSearchh {
    public static void main(String[] args) {
        int[] arr={34,23,65,68,9,32,56,34};
        int target=56;
        int ans=Searching(arr,target);
        System.out.println(ans);
    }
    static int Searching(int[] arr,int tar){
        int l=arr.length;
        for (int i = 0; i < l; i++) {
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
}
