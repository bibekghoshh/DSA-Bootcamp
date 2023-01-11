package Ghosh;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  //initialization
        }

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                list.get(j).add(sc.nextInt());
            }
        }
        for (int i = 0; i < 3; i++) {
                System.out.print(list.get(i)+" ");
            }


        //System.out.println(list);
    }
}
