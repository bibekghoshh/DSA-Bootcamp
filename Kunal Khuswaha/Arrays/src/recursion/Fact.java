package recursion;

public class Fact {
    public static void main(String[] args) {
        int ans=sum(5);
        System.out.println(ans);
    }

    static int fac(int n){
        if(n==1) return 1;

        return n*fac(n-1);
    }

    static int sum(int n){
        if(n==0) return 0;

        return n+sum(n-1);
    }
}
