package bibek.com;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int age=s.nextInt();
//        iseligible(age);

        int a=s.nextInt();
        int b=s.nextInt();
        int ans=sum(a,b);
        System.out.println(ans);
    }

    static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    static void iseligible(int x){
        if(x>=18){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
    }
}
