package com.bibek;

import java.util.Scanner;

public class UserInputUntilZero {
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner sc=new Scanner(System.in);
        int result=0,max=0;
        for (int i=0;i<20;i++){
            array[i]=sc.nextInt();
            result+=array[i];   //adding the arrays
            if(array[i]>max){  //checking the arrays which one is largest
                max=array[i];
            }
            if(array[i]==0){
                break;
            }
        }
        System.out.println(result);
        System.out.println(max);
    }
}
