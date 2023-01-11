package bibek.com;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        String re=oddeven(x);
        System.out.println(re);
    }
    static String oddeven(int x){
        if(x%2==0){
            return "even";
        }
        return "odd";
    }
}
