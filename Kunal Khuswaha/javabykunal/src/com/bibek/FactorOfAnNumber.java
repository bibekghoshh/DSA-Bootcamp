package com.bibek;

public class FactorOfAnNumber {
    public static void main(String[] args) {
        int n=150;
        for (int i = 1; i <= n; i++) {
                if(n%i==0){
                    System.out.print(i+" ");
                }
        }
    }
}
