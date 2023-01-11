package com.bibek;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float d=r*0.013f;
        System.out.println(d);
    }
}
