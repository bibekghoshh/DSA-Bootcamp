package bibek.com;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totmarks=0,percentage=0;
        System.out.print("Enter number of Subject -> ");
        int sub=sc.nextInt();
        System.out.println("Enter marks of "+sub +" subject :");
        for (int i = 0; i < sub; i++) {
            totmarks=totmarks+sc.nextInt();
        }
        System.out.println("Total marks is -> "+totmarks);
        percentage=totmarks/sub;
        System.out.println(percentage);


        switch ((int)percentage / 10){
            case 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("AB");
                break;
            case 7:
                System.out.println("BB");
                break;
            case 6:
                System.out.println("BC");
                break;
            case 5:
                System.out.println("CD");
                break;
            default:
                System.out.println("DD");
        }
    }
}
