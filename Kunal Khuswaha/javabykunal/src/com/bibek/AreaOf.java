package com.bibek;

import java.util.Scanner;

public class AreaOf {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int r=in.nextInt();
//        Circle(r);
        int base=in.nextInt();
        int height=in.nextInt();
        Traingle(height,base);

    }
    public static void Circle(int n){
        final  double pi=3.141592653589793;

        double result=pi*n*n;
        System.out.println(result);
    }
    public static void Traingle(int h,int b){
        double result=(h*b)/2;
        System.out.println(result);
    }

}
