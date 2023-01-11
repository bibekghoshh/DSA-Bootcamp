package com.bibek;

public class LCM {
    public static void main(String[] args) {
        int a=14,min=0;
        int b=35;
        for (int i = 2; i <=a && i<=b; i++) {
            if (a%i==0 && b%i==0){
                min=i;
                break;
            }
        }
        System.out.println(min);
    }
}
