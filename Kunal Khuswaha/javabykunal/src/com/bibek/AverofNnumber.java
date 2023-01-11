package com.bibek;

import java.util.Scanner;

public class AverofNnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        double result=0,avg=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            result+=a[i];
             avg=result/n;
        }
        System.out.println(avg);
    }
}
