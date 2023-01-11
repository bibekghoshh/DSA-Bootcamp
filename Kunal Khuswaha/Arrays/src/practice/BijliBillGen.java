package practice;

import java.util.Scanner;

public class BijliBillGen {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Unit :-> ");
        int unit=sc.nextInt();

        double slabone=100,slabtwo=180,slabthree=300,slabfour=500;
        double totalMoney;
        if(unit<=slabone){
            totalMoney=unit*3.26;
            System.out.println("Total amount to be Pay :-> "+totalMoney);
        } else if (unit<=slabtwo) {
             totalMoney=(slabone*3.26)+((unit-slabone)*5);
            System.out.println("Total amount to be Pay :-> "+totalMoney);
        } else if (unit<=slabthree) {
            totalMoney=(slabone*3.26)+((slabtwo-slabone)*5)+((unit-slabtwo)*6.98);
            System.out.println("Total amount to be Pay :-> "+totalMoney);
        } else if (unit<=slabfour) {
            totalMoney=(slabone*3.26)+((slabtwo-slabone)*5)+((slabthree-slabtwo)*6.98)+((unit-slabthree)*10);
            System.out.println("Total amount to be Pay :-> "+totalMoney);
        }else {
            totalMoney=(slabone*3.26)+((slabtwo-slabone)*5)+((slabthree-slabtwo)*6.98)+((slabfour-slabthree)*10)+(unit-slabfour)*12;
            System.out.println("Total amount to be Pay :-> "+totalMoney);
        }

    }
}
