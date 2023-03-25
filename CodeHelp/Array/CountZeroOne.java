package Array;

public class CountZeroOne {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,0,0,0,0,1,1,1,0,1};

        int one=0;
        int zero=0;

        for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0){
                    zero++;
                }else if(arr[i]==1){
                    one++;
                }
        }
        System.out.println("Number of Zero -> "+zero+"\n Number of one -> "+one);
    }
}
