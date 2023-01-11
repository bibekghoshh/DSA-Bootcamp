package com.bibek;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int q=100;
        int m=400;
        int arm=0,a=0,i=0;
            for (int j=q;j<m;j++){
               int n=j;
                int result=0;
        while(i<n){
            a=n%10;
            arm=a*a*a;
            result=result+arm;
            n=n/10;
        }
        if(j==result){
            System.out.println(result);
        }
    }
    }
}
