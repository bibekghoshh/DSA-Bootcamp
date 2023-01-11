package Ghosh;

import java.util.Arrays;
import java.util.Scanner;

public class Arraay {
    public static void main(String[] args) {
        int[] arr=new int[5];
        String[] ar=new String[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.next();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        //enchanced for loop
//        for(int a : arr){
//            System.out.print(a+" ");
//        }
           // change(arr);
       // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ar));
    }
    static void change(int[] arr){
        arr[3]=99;
    }
}
