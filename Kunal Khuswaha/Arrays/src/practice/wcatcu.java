package practice;

public class wcatcu {
    public static void main(String[] args) {
        int a=1234,b=156,c=27;
        reverse(a);
        armstrong(b);
        perfect(c);
    }
    static void perfect(int n){
        int a=n,per=0;
        for (int i = 1; i <= a/2; i++) {
            if(a%i==0){
                per=per+i;
            }
        }
        if(n==per){
            System.out.println("perfect ");
        }else{
            System.out.println("not perfect");
        }
    }
    static void reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10; 
        }
        System.out.println(rev);
    }
    static void armstrong(int n){
        int a=n,arm=0;
        while(a>0){
            int rem=a%10;
            arm=arm+rem*rem*rem;
            a/=10;
        }
        if(n==arm){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }

}
