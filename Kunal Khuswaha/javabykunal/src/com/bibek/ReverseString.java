package com.bibek;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        String na="";
        for (int i = 0; i <name.length(); i++) {
            char ch=name.charAt(i);
            na=ch+na;
        }
        System.out.println(na);
    }
}
