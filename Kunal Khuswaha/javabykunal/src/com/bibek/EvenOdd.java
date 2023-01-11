package com.bibek;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=31;
        int count=0;
        for (int i = 2; i < a; i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
