package Array;

public class ExtreamPrint {
    public static void main(String[] args) {
        int extreme[]={10,20,30,40,9,60,70,8,12};

        int start=0;
        int end=extreme.length-1;

        while(start<=end){
            if(start==end){
                System.out.println(extreme[start]);
            }else{
                System.out.println(extreme[start]);
                System.out.println(extreme[end]);
            }
            start++;
            end--;
        }
    }
}
