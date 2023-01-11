package com.bibek;

import java.util.Scanner;

public class CountingNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while (a>0){
            int rem=a%10;
            if (rem==2){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
