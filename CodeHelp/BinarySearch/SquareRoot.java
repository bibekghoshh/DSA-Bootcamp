package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int squareRoot=26;

        int start=0,end=squareRoot,ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid*mid > squareRoot){
                end=mid-1;
            }else{
                start=mid+1;
                ans=mid;
            }
        }
        System.out.println(ans);
        double finalAns=ans;

        int precision=10;
        double step=0.1;
        for (int i = 0; i < precision; i++) {    
            for(double j=finalAns;j*j<=squareRoot;j=j+step){
                    finalAns=j;
            }
            step=step/10;
        }

        System.out.println(finalAns);
    }
}
