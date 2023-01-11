package com.bibek;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" principal amount -> ");
        int p=sc.nextInt();
        System.out.println("rate of interest -> ");
        float r=sc.nextFloat();
        System.out.println("time period ->");
        float t= sc.nextFloat();
        float result=(p*t*r)/100;
        System.out.println("total interest  -> "+result);
        r=result+p;
        System.out.println("new amount is "+r);
    }
}
