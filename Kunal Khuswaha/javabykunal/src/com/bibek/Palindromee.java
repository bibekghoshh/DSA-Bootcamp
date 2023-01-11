package com.bibek;

import java.util.Scanner;

public class Palindromee {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        String name=obj.nextLine();
        String rev="";
                char ch;
                for (int i=0;i<name.length();i++){
                  ch=name.charAt(i);
                  rev=ch+rev;
                }
        if(rev.equals(name)){
            System.out.println("Given String is palindrome");
            System.out.println(rev);
        }else {
            System.out.println("Strong is not palindrome");
            System.out.println(rev);
        }
    }
}
