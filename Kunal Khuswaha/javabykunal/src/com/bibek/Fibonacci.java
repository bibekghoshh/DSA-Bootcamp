package com.bibek;

public class Fibonacci {
    public static void main(String[] args) {
        int a=1,b=1;
        int c=0;
       while(c<400){
             c=a+b;
                a=b;
                b=c;

            System.out.println(a);

        }
    }
}
