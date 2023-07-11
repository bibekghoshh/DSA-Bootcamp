package BinarySearch;

public class DevideNoInBinarySearch {
    public static void main(String[] args) {
        int dividend=17;
        int divisor=7;
        int quotient=0;
        int start=0;
        int end=dividend;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid*divisor<=dividend){
                quotient=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        System.out.println(quotient);
    }
}
