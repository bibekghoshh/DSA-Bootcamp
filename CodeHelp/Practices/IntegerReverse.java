class IntegerReverse{
    public static void main(String[] args) {
        int n=123;

        int ans=0;
        boolean isNagative=false;

        if(n<=Integer.MIN_VALUE) ans=0;

        if(n<0){
            isNagative=true;
            n=-n;
            // System.out.println(n);
        }

        while(n>0){
            
            int digit=n%10;
            ans=ans*10+digit;
            n=n/10;
        }

        System.out.println(isNagative?-ans:ans);
    }
}