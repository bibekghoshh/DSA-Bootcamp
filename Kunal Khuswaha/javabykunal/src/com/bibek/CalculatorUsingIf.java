package com.bibek;

import java.util.Scanner;

public class CalculatorUsingIf {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter your operator :-> ");
        char ch=in.next().trim().charAt(0);
        System.out.println(" enter your numbers :-> ");
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=0;
        if (ch=='+' || ch=='-' || ch=='/' || ch=='*' || ch=='%'){
            if (ch=='+'){
                ans=a+b;
            }
            if (ch=='-'){
               ans=a-b;
            }
            if (ch=='*'){
                ans=a*b;
            }
            if (ch=='/'){
                if(b!=0){
                    ans=a/b;
                }
            }
            if (ch=='%'){
                ans=a%b;
            }
            System.out.println("Result is -> "+ans);
        }
    }
}
