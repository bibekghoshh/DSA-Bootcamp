package practice;

public class binarytodecimL {
    public static void main(String[] args) {
        int a=110101;
        int count=0;
        int total=0;
        while (a>0){
            int rem=a%10;
            total+=rem*Math.pow(2,count);
            a=a/10;
            count++;
        }
        System.out.println(total);

    }
}
