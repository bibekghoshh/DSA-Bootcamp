package com.bibek;

public class PerfectNo {
    public static void main(String[] args) {
        int a=6,result=0;

        for (int i =1 ; i <= a / 2; i++) {
            if (a % i == 0)
                result = result + i;

        }
        System.out.println(result);
            if(a==result){
                System.out.println("perfect number");
            }else {
                System.out.println("not perfect");
            }

    }
}
