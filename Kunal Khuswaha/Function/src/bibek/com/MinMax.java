package bibek.com;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
    static void min(int p,int q,int r){
        int min=0;
        if(p<q && p<r){
            min=p;
        } else if (q<p && q<r) {
            min=q;
        }else {
            min=r;
        }
        System.out.println("min- " +min);
    }
    static void max(int x,int y,int z){
        int max=0;
        if (x>max){
            max=x;
        }
        if (y>max){
            max=y;
        }if (z>max){
            max=z;
        }
        System.out.println("max - " +max);
    }
}
