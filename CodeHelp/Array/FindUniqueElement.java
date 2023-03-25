package Array;

public class FindUniqueElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,2,1,6,5,5,4};
        int j=0;
        // method 1 takning O(n pow 2)
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if(i==j) continue;
                if(arr[i]==arr[j]){
                    break;
                }
            }
                if(j==arr.length){
                    System.out.println(arr[i]);
                    break;
                }
        }
        // method 2 taking O(n)
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
