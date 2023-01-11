package com.bibek;

public class HCF {
    public static void main(String[] args) {
        int a=17,max=0;
        int b=89;

        for (int i = 1; i<=a && i<=b; i++) {
            if(a%i==0 && b%i==0){
                max=i;
            }
        }
        System.out.println(max);

    }
}
