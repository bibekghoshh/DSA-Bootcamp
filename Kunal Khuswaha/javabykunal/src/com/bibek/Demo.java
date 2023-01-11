package com.bibek;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

         int a=input.nextInt();
         int b=input.nextInt();
            char mul='*';
        char dev='/';
        char add='+';
        char sub='-';
        if (add == '+') {
            System.out.println("add "+(a+b));
        }  if (sub=='-') {
            System.out.println("sub "+(a-b));
        }  if (mul=='*') {
            System.out.println("mul " +(a*b));
        } if (dev=='/'){
            System.out.println("dev " +(a/b));
        }
    }
}
