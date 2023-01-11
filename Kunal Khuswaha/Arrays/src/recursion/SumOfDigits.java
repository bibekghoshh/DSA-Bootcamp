package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(fun(345));
    }

    static int fun(int n){
        if(n<=0) return 0;
        int rem=n%10;
        return rem+fun(n/10);
    }
}
