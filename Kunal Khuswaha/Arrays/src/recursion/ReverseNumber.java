package recursion;

public class ReverseNumber {
    static int sum=0;
    public static void main(String[] args) {
        fun( 634);
        System.out.println(sum);
    }
    static int fun(int n){
            if(n<=0) return 0;
            int rem=n%10;
            sum=sum*10+rem;
            return fun(n/10);
    }
}
