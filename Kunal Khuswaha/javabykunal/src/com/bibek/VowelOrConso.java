package com.bibek;

import java.util.Scanner;

public class VowelOrConso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);

        if(ch=='a' || ch=='A' || ch=='E' || ch=='e' ||ch=='i' ||ch=='I' ||ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("Consonant");
        }


    }
}
