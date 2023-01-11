package bibek.com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int ans=factorial(f);
        System.out.println(ans);
    }

    static int factorial(int x) {
        int ans=1;
        if(x==1 || x==0){
            return 1;
        }else {
            for (int i = 2; i <= x; i++) {
                ans = ans * i;
            }
            return ans;
        }
    }
}
