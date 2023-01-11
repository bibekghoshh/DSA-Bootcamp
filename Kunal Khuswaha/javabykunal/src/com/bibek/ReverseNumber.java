package com.bibek;

public class ReverseNumber {
    public static void main(String[] args) {
        int z=234535;
        int result=0;
        while(z>0){
            int rem=z%10;
            result=result*10+rem;
            z=z/10;
        }
        System.out.println(result);
    }
}
